package com.echenagucia.screenmatch.models;

public class Tittle implements Comparable<Tittle> {

    private String name;

    private int year;

    private boolean planInclude;

    private double sumEvaluation;

    private int totalEvaluation;

    private int durationInMinutes;


    public Tittle(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public boolean isPlanInclude() {
        return planInclude;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public void setPlanInclude(boolean planInclude) {
        this.planInclude = planInclude;
    }



    public void setName(String name) {
        this.name = name;
    }

    public int getTotalEvaluation() {

        return totalEvaluation;
    }

    public void showTechnicalSheet(){
        System.out.println("El titulo que quieres ver es " + getName());
        System.out.println("La fecha de lanzamiento es " + year);
    };

    public void evaluate(double note){

        sumEvaluation += note;
        totalEvaluation ++;
    }

    public double calculateMedia(){
        return sumEvaluation / totalEvaluation;
    }

    @Override
    public int compareTo(Tittle anotherTittle) {
        return this.getName().compareTo(anotherTittle.getName());
    }
}
