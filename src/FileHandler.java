import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    private final File file = new File("covid_data.csv");

    public ArrayList<Covid19Data> loadData() {

        ArrayList<Covid19Data> covid19Data = new ArrayList<>();

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                String line = sc.nextLine();

                String[] attributes = line.split(";");

                if (attributes.length == 7) {
                    Covid19Data data = new Covid19Data(
                            attributes[0],                             // region
                            attributes[1],                             // aldersgruppe
                            Integer.parseInt(attributes[2]),           // bekræftedeTilfælde
                            Integer.parseInt(attributes[3]),           // døde
                            Integer.parseInt(attributes[4]),           // indlagtePåIntensiv
                            Integer.parseInt(attributes[5]),           // indlagte
                            attributes[6]                              // dato
                    );

                    covid19Data.add(data);
                } else {
                    System.out.println("Springer linje over: " + line);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Fil ikke fundet");
        }

        return covid19Data;
    }
}