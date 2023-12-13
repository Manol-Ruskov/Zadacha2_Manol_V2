package com.company;

public class Main {
    public static void main(String[] args) {

        AnimalHouse.Tiger tiger = new AnimalHouse.Tiger("Shera");
        AnimalHouse.AnimalHouse tigerHouse = new AnimalHouse.AnimalHouse<>(tiger);


        AnimalHouse.Bird bird = new AnimalHouse.Bird(500.0);
        AnimalHouse.AnimalHouse birdHouse = new AnimalHouse.AnimalHouse<>(bird);


        System.out.println("Tiger's name: " + tigerHouse.animal.name);
        System.out.println("Bird's flight height: " + birdHouse.animal.heightOfFlight);
    }
}
