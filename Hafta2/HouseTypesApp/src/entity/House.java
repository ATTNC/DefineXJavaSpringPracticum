package entity;

import entity.abstracts.Building;

public class House extends Building {

    public House(int id, String name, int squareMeters, double priceOfHouse, int numbersOfRooms, int numbersOfHalls) {
        super(id, name, squareMeters, priceOfHouse, numbersOfRooms, numbersOfHalls);
    }
}
