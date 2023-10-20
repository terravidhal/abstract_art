package com.project.abstractart;

// inside of Painting.java
public class Painting extends Art {
    // TODO: implement Painting class
    // MEMBERS VARIABLES
    private String paintType;

    // CONSTRUCTOR
    public Painting(String paintType, String title, String author, String description) {
        super(title, author, description);
        this.paintType = paintType;
    }

    // GETTERS AND SETTERS
    public String getPaintType() {
        return this.paintType;
    }

    public void setPaintType(String paintType) {
        this.paintType = paintType;
    }


    // IMPLEMENT METHOD
    @Override
    public void viewArt() {
        // TODO Auto-generated method stub
        System.out.println("\n========== Painting View ==========\n");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Description: " + description);
        System.out.println("Paint Type: " + paintType);

    }
}