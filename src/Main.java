import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FileHandler fh = new FileHandler();
        Scanner sc = new Scanner(System.in);

        ArrayList<Covid19Data> dataList = fh.loadData();

        System.out.println("Hvordan ønsker du at sortere dine data? \n1) Sorter efter aldersgruppe \n2) sorter efter region");
        String sortOption = sc.nextLine();
        switch (sortOption) {
            case "1" -> {
                dataList.sort(new AldersGruppeComparator());
                System.out.println("==================================== Sorteret efter alderesgruppe ======================================= ");
                printCovidDataList(dataList);
            }
            case "2" -> {
                dataList.sort(new RegionComparator());
                System.out.println("======================================== Sorteret efter region ========================================== ");
                printCovidDataList(dataList);
            }
            default -> {
                System.out.println("=========================================== Usorteret liste ============================================= ");
                printCovidDataList(dataList);
            }
        }
    }

    private static void printCovidDataList(ArrayList<Covid19Data> dataList) {
        System.out.printf("%-15s | %-12s | %-20s | %-5s | %-17s | %-8s | %s%n",
                "Region", "Aldersgruppe", "Bekræftede tilfælde", "Døde", "Intensiv", "Indlagte", "Dato");
        System.out.println("---------------------------------------------------------------------------------------------------------");

        for (Covid19Data data : dataList) {
            System.out.println(data);
        }
    }
}


