package com.project.abstractart;

// inside of Sculpture.java
public class Sculpture extends Art {
    // TODO: implement Sculpture class
    // MEMBERS VARIABLES
    private String material;

    //CONSTRUCTOR
    public Sculpture(String material, String title, String author, String description){
        super(title, author, description);
        this.material = material;
    }

    // GETTERS AND SETTERS
    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    // METHODS IMPLEMENT
    @Override
    public void viewArt() {
        // TODO Auto-generated method stub
        System.out.println("\n========== Sculpture View ==========\n");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Description: " + description);
        System.out.println("Material: " + material);

    }
}

