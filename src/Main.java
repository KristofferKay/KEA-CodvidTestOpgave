import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        FileHandler fh = new FileHandler();
        ArrayList<Covid19Data> covidData = fh.loadAllData();

        System.out.println("Sorting by Name");
        Collections.sort(covidData, new RegionComparator());
        for (Covid19Data covid19Data : covidData) {
            System.out.println(covid19Data);
        }

    }
}
