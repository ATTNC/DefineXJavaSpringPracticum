package repository.impl;

import entity.House;
import entity.Summerhouse;
import entity.Villa;
import entity.abstracts.Building;
import repository.BuildingRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuildingRepositoryImpl implements BuildingRepository {

    //House Repository
    private static final List<Building> houses = new ArrayList<>(
            Arrays.asList(
                    new House(1, "One Room Apartment", 100, 150000, 1, 1),
                    new House(2, "Apartment", 120, 250000, 2, 1),
                    new House(3, " Single Family House", 150, 400000, 3, 1)
            )
    );

    //Villa Repository
    private static final List<Building> villas = new ArrayList<>(
            Arrays.asList(
                    new Villa(1, "Dublex Villa", 150, 500000, 3, 1),
                    new Villa(2, "Triplex Villa", 250, 750000, 4, 2),
                    new Villa(3, "Ultra Lux Villa", 350, 1000000, 6, 3)
            )
    );

    //Summerhouse Repository
    private static final List<Building> summerhouses = new ArrayList<>(
            Arrays.asList(
                    new Summerhouse(1, "Apartment Summer House ", 100, 300000, 2, 1),
                    new Summerhouse(2, "Lux Summer House ", 150, 600000, 3, 1),
                    new Summerhouse(3, "Ultra Lux Summer House", 250, 1500000, 5, 2)
            )
    );


    @Override
    public List<Building> getHouseList() {
        return houses;
    }

    @Override
    public List<Building> getVillaList() {
        return villas;
    }

    @Override
    public List<Building> getSummerHouseList() {
        return summerhouses;
    }

    @Override
    public List<Building> getAllBuildings() {
        return concatAllBuildings(houses, villas, summerhouses);
    }


    // We should use @SaveVarargs Annotation to the method. Because we used variable arguments as parameter
    @SafeVarargs
    private List<Building> concatAllBuildings(List<Building>... buildings) {

        List<Building> concat = new ArrayList<>();

        for (List<Building> buildingList : buildings) {
            concat.addAll(buildingList);
        }
        return concat;

    }
}
