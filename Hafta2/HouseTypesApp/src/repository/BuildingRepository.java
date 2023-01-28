package repository;

import entity.abstracts.Building;

import java.util.List;

public interface BuildingRepository {

    List<Building> getHouseList();

    List<Building> getVillaList();

    List<Building> getSummerHouseList();

    List<Building> getAllBuildings();
}
