package service;

import entity.abstracts.Building;

import java.math.BigDecimal;
import java.util.List;

public interface BuildingService {


    double getTotalHousePrice();

    double getTotalVillaPrice();

    double getTotalSummerhousePrice();

    double getAllBuildingsPrice();

    double getAverageHouseSquareMeters();

    double getAverageVillaSquareMeters();

    double getAverageSummerhouseSquareMeters();

    double getAllBuildingsAverageSquareMeters();

    List<Building> getFilteredBuildings(int numbersOfRooms, int numbersOfHalls);


}
