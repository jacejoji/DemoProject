package com.tasks.week1;

public class Movie {
    private String title;
    private String genre;
    private double rentalPrice;

    public Movie(String title, String genre, double rentalPrice) {
        this.title = title;
        this.genre = genre;
        this.rentalPrice = rentalPrice;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }
}

