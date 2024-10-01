package com.echenagucia.screenmatch.models;

public class Serie extends Tittle  {

    private int season;
    private int episodeBySeason;
    private int minutesByEpisode;

    public Serie(String name, int year) {
        super(name, year);
    }

    @Override
    public int getDurationInMinutes() {
        return season*episodeBySeason*minutesByEpisode;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getEpisodeBySeason() {
        return episodeBySeason;
    }

    public void setEpisodeBySeason(int episodeBySeason) {
        this.episodeBySeason = episodeBySeason;
    }

    public int getMinutesByEpisode() {
        return minutesByEpisode;
    }

    public void setMinutesByEpisode(int minutesByEpisode) {
        this.minutesByEpisode = minutesByEpisode;
    }
}
