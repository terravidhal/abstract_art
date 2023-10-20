package com.project.abstractart;
import java.util.ArrayList;
import java.util.Collections;
// inside of Museum.java
public class Museum {
    public static void main(String[] args) {
        // TODO: create paintings and sculptures here
        // NINJAS BONUS 1 :CREATE ARRAYLIST "museum"
        ArrayList<Art> museum1 = new ArrayList<Art>();

        Painting painting1 = new Painting("Primer","MONA LISA", "Léonard de vinci", "MONA LISA");
        museum1.add(painting1);

        Painting painting2 = new Painting("Oil-based", "Ecole d'athènes", "Raphael", "Ecole d'athènes");
        museum1.add(painting2);

        Painting painting3 = new Painting("Acrylic", "La creation d'Adam", "Michel-ange", "La creation d'Adam");
        museum1.add(painting3);

        Sculpture sculpture1 = new Sculpture("Plaster","Michel-Ange", "David Florence", "Michel-Ange");
        museum1.add(sculpture1);

        Sculpture sculpture2 = new Sculpture("Stone", "Le penseur", "Auguste Rodin", "Le penseur");
        museum1.add(sculpture2);

        painting1.viewArt();
        painting2.viewArt();
        painting3.viewArt();

        sculpture1.viewArt();
        sculpture2.viewArt();

        // NINJA BONUS 2
        Collections.shuffle(museum1); //method shuffle() of the collections class
        System.out.println("\n****************ARRAY SHUFFLE*************");
        for (Art elt : museum1) { // "Art" le type de elt, elt => obj mis dns l'Array
            elt.viewArt();
        }
    }
}

