package com.tasks.week1;
import java.util.ArrayList;

public class MovieRentalSystemMain {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception", "Sci-Fi", 3.99));
        movies.add(new Movie("The Godfather", "Crime", 2.99));
        
        double totalRentalEarnings = 0;
        for (Movie movie : movies) {
            totalRentalEarnings += movie.getRentalPrice();
        }

        System.out.println("Total Rental Earnings: $" + totalRentalEarnings);
    }
}

