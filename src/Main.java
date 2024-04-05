import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FileHandler fh = new FileHandler();
        ArrayList<Covid19Data> covidDataArr = fh.loadAllData();

        for (Covid19Data covid19Data : fh.loadAllData()) {
                System.out.println(covidDataArr);
        }
    }
}
