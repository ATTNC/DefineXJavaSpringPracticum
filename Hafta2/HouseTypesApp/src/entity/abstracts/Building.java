package entity.abstracts;


public abstract class Building {

    private int id;
    private String name;
    private int squareMeters;
    private double priceOfHouse;
    private int numbersOfRooms;
    private int numbersOfHalls;

    public Building() {
    }

    public Building(int id, String name, int squareMeters, double priceOfHouse, int numbersOfRooms, int numbersOfHalls) {
        this.id = id;
        this.name = name;
        this.squareMeters = squareMeters;
        this.priceOfHouse = priceOfHouse;
        this.numbersOfRooms = numbersOfRooms;
        this.numbersOfHalls = numbersOfHalls;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(int squareMeters) {
        this.squareMeters = squareMeters;
    }

    public double getPriceOfHouse() {
        return priceOfHouse;
    }

    public void setPriceOfHouse(double priceOfHouse) {
        this.priceOfHouse = priceOfHouse;
    }

    public int getNumbersOfRooms() {
        return numbersOfRooms;
    }

    public void setNumbersOfRooms(int numbersOfRooms) {
        this.numbersOfRooms = numbersOfRooms;
    }

    public int getNumbersOfHalls() {
        return numbersOfHalls;
    }

    public void setNumbersOfHalls(int numbersOfHalls) {
        this.numbersOfHalls = numbersOfHalls;
    }
}
