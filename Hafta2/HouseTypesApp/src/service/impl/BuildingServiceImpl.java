package service.impl;

import entity.abstracts.Building;
import repository.BuildingRepository;
import service.BuildingService;

import java.util.List;

public class BuildingServiceImpl implements BuildingService {

    private final BuildingRepository buildingRepository;

    public BuildingServiceImpl(BuildingRepository buildingRepository) {
        this.buildingRepository = buildingRepository;
    }


    @Override
    public double getTotalHousePrice() {

        return totalPrice(buildingRepository.getHouseList());

    }

    @Override
    public double getTotalVillaPrice() {
        return totalPrice(buildingRepository.getVillaList());
    }

    @Override
    public double getTotalSummerhousePrice() {
        return totalPrice(buildingRepository.getSummerHouseList());
    }

    @Override
    public double getAllBuildingsPrice() {
        return totalPrice(buildingRepository.getAllBuildings());
    }

    @Override
    public double getAverageHouseSquareMeters() {
        return averageSquareMeter(buildingRepository.getHouseList());
    }

    @Override
    public double getAverageVillaSquareMeters() {
        return averageSquareMeter(buildingRepository.getVillaList());
    }

    @Override
    public double getAverageSummerhouseSquareMeters() {
        return averageSquareMeter(buildingRepository.getSummerHouseList());
    }

    @Override
    public double getAllBuildingsAverageSquareMeters() {
        return averageSquareMeter(buildingRepository.getAllBuildings());
    }

    @Override
    public List<Building> getFilteredBuildings(int numbersOfRooms, int numbersOfHalls) {
        return filterBuilding(numbersOfRooms, numbersOfHalls, buildingRepository.getAllBuildings());
    }


    //Total price method
    private double totalPrice(List<Building> buildings) {

        double totalOfPrice = 0;

        for (Building building : buildings) {

            totalOfPrice += building.getPriceOfHouse();
        }

        return totalOfPrice;
    }

    // Average square meters method
    private double averageSquareMeter(List<Building> buildings) {

        double average = 0;

        for (Building building : buildings) {

            average += building.getSquareMeters();
        }
        return average / buildings.size();
    }

    // Filtering method according to the number of rooms and halls
    private List<Building> filterBuilding(int numbersOfRooms, int numbersOfHalls, List<Building> buildings) {

        return buildings.stream().filter(b -> b.getNumbersOfHalls() == numbersOfHalls && b.getNumbersOfRooms() == numbersOfRooms).toList();

    }
}
