package com.echenagucia.screenmatch.models;

import com.echenagucia.screenmatch.calculation.Clasification;

public class Movie extends Tittle implements Clasification{

    private String Director;


    public Movie(String name, int year) {
        super(name, year);
    }


    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    @Override
    public int getClasification() {
        return (int) calculateMedia() / 2;
    }

    @Override
    public String toString() {
        return "Pelicula: " + this.getName() + " (" + getYear()  + ")";
    }
}
