import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    static FileHandler fh = new FileHandler();
    static ArrayList<Covid19Data> covidData = fh.loadAllData();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ønsker du at sortere via Navn eller via Age");
        String input = scanner.next();
        switch (input) {
            case "navn" -> {sortName();}
            case "age" -> { sortAge();}
        }
    }

    public static void sortName() {
        System.out.println("Sorting by Name");
        Collections.sort(covidData, new RegionComparator().reversed());
        for (Covid19Data covid19Data : covidData) {
            System.out.println(covid19Data);
        }
    }
    public static void sortAge() {
        System.out.println("Sorting by Age");
        Collections.sort(covidData, new AldersGruppeComparator());
        for (Covid19Data cd : covidData) {
            System.out.println(cd);
        }
    }
}
