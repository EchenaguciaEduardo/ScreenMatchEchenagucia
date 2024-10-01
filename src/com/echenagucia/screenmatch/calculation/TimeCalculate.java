package com.echenagucia.screenmatch.calculation;

import com.echenagucia.screenmatch.models.Movie;
import com.echenagucia.screenmatch.models.Serie;
import com.echenagucia.screenmatch.models.Tittle;

public class TimeCalculate {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void include(Tittle tittle){
        this.totalTime+= tittle.getDurationInMinutes();
    }

}
