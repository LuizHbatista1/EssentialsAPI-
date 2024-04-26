package com.Essentials.EssentialsApi;

public class ComicsBookNotFoundException extends RuntimeException {
    public ComicsBookNotFoundException(Long id) {

        super("Could not find book " +id ); // Print out case id not find

    }
}
