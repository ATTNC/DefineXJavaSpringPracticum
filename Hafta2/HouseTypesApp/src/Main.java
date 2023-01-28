import repository.impl.BuildingRepositoryImpl;
import service.BuildingService;
import service.impl.BuildingServiceImpl;


public class Main {


    public static void main(String[] args) {

        BuildingService buildingService = new BuildingServiceImpl(new BuildingRepositoryImpl());


        System.out.println("--------------------------------------");
        System.out.println("Total prices of houses : " + buildingService.getTotalHousePrice());
        System.out.println("--------------------------------------");
        System.out.println("Total prices of villas : " + buildingService.getTotalVillaPrice());
        System.out.println("--------------------------------------");
        System.out.println("Total prices of summerhouses : " + buildingService.getTotalSummerhousePrice());
        System.out.println("--------------------------------------");
        System.out.println("Total prices of all buildings : " + buildingService.getAllBuildingsPrice());
        System.out.println("--------------------------------------");
        System.out.printf("Average square meter of houses : %.2f \n", buildingService.getAverageHouseSquareMeters()); // We use printf because we want to print 2 digits after the comma
        System.out.println("--------------------------------------");
        System.out.printf("Average square meter of villas : %.2f \n", buildingService.getAverageVillaSquareMeters()); // We use "," instead of "+" with parameters in the printf method !
        System.out.println("--------------------------------------");
        System.out.printf("Average square meter of summerhouses : %.2f \n", buildingService.getAverageSummerhouseSquareMeters());
        System.out.println("--------------------------------------");
        System.out.printf("Average square meter of all buildings : %.2f \n", buildingService.getAllBuildingsAverageSquareMeters());
        System.out.println("--------------------------------------");
        System.out.println("Filtered Buildings :");
        buildingService.getFilteredBuildings(3, 1).forEach(b ->
                System.out.println(
                        "Building Type: " + b.getClass().getName()
                                + " - Room: " + b.getNumbersOfRooms()
                                + " - Hall: " + b.getNumbersOfHalls()
                )
        );
        System.out.println("--------------------------------------");
    }

}
