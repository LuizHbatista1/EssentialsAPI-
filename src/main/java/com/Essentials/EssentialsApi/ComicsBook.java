package com.Essentials.EssentialsApi;

import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;

@Entity // Enity is very important for the Application , help us to map domain objects
public class ComicsBook {

    private @Id @GeneratedValue Long id;
    private String name;
    private String category;
    private String by;

    ComicsBook(){}

    ComicsBook(String name , String category , String by){

        this.name = name;
        this.category =  category;
        this.by = by;
    }

    public Long getId() {
        return id;
    }

    public String getName(){

        return name;
    }

    public String getCategory(){

        return category;
    }

    public String getBy() {
        return by;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setBy(String by) {
        this.by = by;
    }

    @Override
    public boolean equals(Object o) {

        if(this == o)
            return true;


        if(!(o instanceof ComicsBook))
            return false;

        ComicsBook comicsbook = (ComicsBook)o;
        return Objects.equals(this.name , comicsbook.name) && Objects.equals(this.category , comicsbook.category)
                && Objects.equals(this.by , comicsbook.by);

    }

    @Override
    public int hashCode(){
        return Objects.hash(this.id , this.name , this.category , this.by);
    }

    @Override
    public String toString(){

        return "ComicsBook{" + "id=" + this.id + ", name='" + this.name + ", category='" + this.category + ", by='" + this.by
                + "}";

    }

}
