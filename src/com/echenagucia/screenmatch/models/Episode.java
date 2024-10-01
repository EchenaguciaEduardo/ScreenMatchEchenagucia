package com.echenagucia.screenmatch.models;

import com.echenagucia.screenmatch.calculation.Clasification;

import java.io.Serializable;

public class Episode implements Clasification {

    private int id;
    private String title;
    private Serie serie;
    private int totalVisualizations;

    public int getTotalVisualizations() {
        return totalVisualizations;
    }

    public void setTotalVisualizations(int totalVisualizations) {
        this.totalVisualizations = totalVisualizations;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClasification() {
        if (totalVisualizations > 100) {
            return 4;
        }else{
            return 2;
        }
    }
}
