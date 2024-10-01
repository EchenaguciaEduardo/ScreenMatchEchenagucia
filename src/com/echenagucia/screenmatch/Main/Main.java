package com.echenagucia.screenmatch.Main;

import com.echenagucia.screenmatch.calculation.RecomendationFilter;
import com.echenagucia.screenmatch.calculation.TimeCalculate;
import com.echenagucia.screenmatch.models.Episode;
import com.echenagucia.screenmatch.models.Movie;
import com.echenagucia.screenmatch.models.Serie;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Movie myMovie = new Movie("Encanto", 2021);
        myMovie.setYear(2021);
        myMovie.setDurationInMinutes(120);
        myMovie.setPlanInclude(true);

        myMovie.showTechnicalSheet();
        myMovie.evaluate(10);
        myMovie.evaluate(10);
        myMovie.evaluate(8);
        myMovie.evaluate(7.1);

        System.out.println("El total de la evaluacion de la pelicula es " + myMovie.getTotalEvaluation());
        System.out.println("Y la clasificacion media de la pelicula es " + myMovie.calculateMedia());


        Serie casaDragon = new Serie("Casa Dragon",  2022);
        casaDragon.setSeason(1);
        casaDragon.setMinutesByEpisode(50);
        casaDragon.setEpisodeBySeason(10);
        casaDragon.showTechnicalSheet();
        System.out.println("La duracion en minutos de la serie " + casaDragon.getName() + "es " + casaDragon.getDurationInMinutes() +  " minutos");

        Movie anotherMovie = new Movie("Avatar", 1998);
        anotherMovie.setDurationInMinutes(200);

        TimeCalculate calculate = new TimeCalculate();
        calculate.include(myMovie);
        calculate.include(casaDragon);
        calculate.include(anotherMovie);
        System.out.println("Tiempo necesario para ver tus titulos en vacaciones " + calculate.getTotalTime() + " minutos");

        RecomendationFilter recomendationFilter = new RecomendationFilter();
        recomendationFilter.filter(myMovie);

        Episode episode = new Episode();
        episode.setId(1);
        episode.setTitle("La casa Targaryen");
        episode.setSerie(casaDragon);
        episode.setTotalVisualizations(10);

        recomendationFilter.filter(episode);

        var movieEduardo = new Movie("El señor de los anillos", 2001);
        movieEduardo.setDurationInMinutes(180);

        ArrayList<Movie> listOfMovies = new ArrayList<>();
        listOfMovies.add(movieEduardo);
        listOfMovies.add(myMovie);
        listOfMovies.add(anotherMovie);


        System.out.println("Tamaño de la lista: " + listOfMovies.size());
        System.out.println("La primera pelicula es " + listOfMovies.get(0).getName());
        System.out.println(listOfMovies.toString());
        System.out.println("toString de la pelicula: " +  listOfMovies.get(0).toString());




    }



}
