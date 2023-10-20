package com.project.abstractart;

// inside of Art.java
public abstract class Art {
    // TODO: implement Art class

    // MEMBERS VARIABLES
     String title;
     String author;
     String description;

     // ABSTRACT METHOD
    public abstract void viewArt();

    // CONSTRUCTOR
    public Art(String title, String author, String description) {
        this.title = title;
        this.author = author;
        this.description = description;
    }

}

