package com.ltp.workbook;

public class Show {
    private String title;
    private String episode;
    private double rating;

    public Show(String title, String episode, double rating) {
        this.title = title;
        this.episode = episode;
        this.rating = rating;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public String getEpisode() {
        return episode;
    }

    public double getRating() {
        return rating;
    }


}
