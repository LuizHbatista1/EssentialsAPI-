package com.Essentials.EssentialsApi;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // To create the database is necessary call the method configuration
public class LoadDatabase {

    private static final Logger log =LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(ComicsBookRepository repository) {  // after instantiate the method bean
                                                                      // I start the database with CommandLineRunner

        return args -> {

            // Here I created tree request for my API
            log.info("Preloading " + repository.save(new ComicsBook("Batman Dark Knight","Drama","DC")));
            log.info("Preloading " + repository.save(new ComicsBook("Flash The BreakPoint","Adventure","DC")));
            log.info("Preloading " + repository.save(new ComicsBook("Civil War","Adventure","Marvel")));



        };

    }

}
