package com.company.Movie;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        Movie[] array = new Movie[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the title of the Movie # " + (i + 1) + ":  ");
            Movie movie = new Movie(sc.nextLine(), random.nextInt(11));
            array[i] = movie;
        }

        System.out.println("\nAll movies list:");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ": TITLE: " + array[i].getTitle() + ", RATING: " + array[i].getRating());
        }
        System.out.println("\nBest-rated movie/movies");
        for (int i = 0; i < 10; i++) {
            if (array[i].getRating() >= 8) {
                System.out.println("TITLE: " + array[i].getTitle());
            }
        }
    }
}
