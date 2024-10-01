package com.echenagucia.screenmatch.Main;

import com.echenagucia.screenmatch.models.Movie;
import com.echenagucia.screenmatch.models.Serie;
import com.echenagucia.screenmatch.models.Tittle;

import java.util.ArrayList;

public class MainLists {

    public static void main(String[] args) {

        Movie myMovie = new Movie("Encanto", 2021);
        myMovie.evaluate(9);
        Movie anotherMovie = new Movie("Avatar", 2023);
        myMovie.evaluate(10);
        var movieEduardo = new Movie("El señor de los anillos", 2001);
        movieEduardo.evaluate(9);
        Serie casaDragon = new Serie("Casa Dragon",  2022);

        Movie p1 = movieEduardo;

        ArrayList<Tittle> list = new ArrayList<>();

        list.add(myMovie);
        list.add(anotherMovie);
        list.add(movieEduardo);
        list.add(casaDragon);

        for (Tittle item : list) {
            System.out.println(item.getName());
            if (item instanceof Movie movie){
                System.out.println(movie.getClasification() );
            }

        }

        {

        }
    }
}
// && movie.getClasification() >3