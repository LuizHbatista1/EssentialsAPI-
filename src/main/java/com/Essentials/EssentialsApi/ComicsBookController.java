package com.Essentials.EssentialsApi;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//The controller is responsible for make the CRUD

@RestController
public class ComicsBookController {

    private final ComicsBookRepository repository;

    ComicsBookController(ComicsBookRepository repository){

        this.repository = repository;

    }

    @GetMapping("/comicsbook")
    List<ComicsBook> all (){

        return repository.findAll();

    }

    @PostMapping("/comicsbook")
    ComicsBook newComicsBook(@RequestBody ComicsBook newComicsBook){

        return repository.save(newComicsBook);

    }

    @GetMapping("/comicsbook/{id}")
    ComicsBook one(@PathVariable Long id){

        return repository.findById(id)
                .orElseThrow(() -> new ComicsBookNotFoundException(id));

    }

    @PutMapping("/comicsbook/{id}")
    ComicsBook replaceComicsBook(@RequestBody ComicsBook newComicsBook , @PathVariable Long id){

        return repository.findById(id)
                .map(comicsBook -> {

                    comicsBook.setName(newComicsBook.getName());
                    comicsBook.setCategory(newComicsBook.getCategory());
                    comicsBook.setBy(newComicsBook.getBy());
                    return repository.save(comicsBook);

                })

                .orElseGet(() -> {

                    newComicsBook.setId(id);
                    return repository.save(newComicsBook);

                });

    }

    @DeleteMapping("/comicsbook/{id}")
    void deleteComicsBook(@PathVariable Long id){

        repository.deleteById(id);
    }

}
