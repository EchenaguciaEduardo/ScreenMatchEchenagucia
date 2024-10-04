package com.echenagucia.screenmatch.Main;

import com.echenagucia.screenmatch.models.Movie;
import com.echenagucia.screenmatch.models.Serie;
import com.echenagucia.screenmatch.models.Tittle;

import java.util.*;

public class MainLists {

    public static void main(String[] args) {

        Movie myMovie = new Movie("Encanto", 2021);
        myMovie.evaluate(9);

        Movie anotherMovie = new Movie("Avatar", 2023);
        anotherMovie.evaluate(6);

        var movieEduardo = new Movie("El señor de los anillos", 2001);
        movieEduardo.evaluate(10);

        Serie casaDragon = new Serie("Lost",  2001);

        Movie p1 = movieEduardo;

        ArrayList<Tittle> list = new ArrayList<>();
        list.add(myMovie);
        list.add(anotherMovie);
        list.add(movieEduardo);
        list.add(casaDragon);

        for (Tittle item : list) {
            System.out.println(item.getName());
            if (item instanceof Movie movie && movie.getClasification() >3){
                System.out.println(movie.getClasification() );
            }

        }
       List<String> lisArtist = new ArrayList<>();
        lisArtist.add("Penelope Cruz");
        lisArtist.add("Antonio Banderas");
        lisArtist.add("Ricardo Darin");
        System.out.println(lisArtist);

        Collections.sort(lisArtist);
        System.out.println("lista de artistas ordenadas "  + lisArtist);

        Collections.sort(list);
        System.out.println("Lista ordenada de titulos " + list);

        list.sort(Comparator.comparing(Tittle::getYear));
        System.out.println("Lista ordenada por años " + list);

    }
}
