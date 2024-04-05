import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FileHandler {
    private final File file = new File("11_noegletal_pr_region_pr_aldersgruppe.csv");

    public ArrayList<Covid19Data> loadAllData() {
        ArrayList<Covid19Data> covid19Data = new ArrayList();
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            sc.nextLine();  // Skip første linje

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Covid19Data covid19Data1 = null;
        while (sc.hasNext()) {
            String line = sc.nextLine();    // Split linje og læg tokens i attributter
            String[] attributes = line.split(";");
            covid19Data1 = new Covid19Data(
                    (attributes[0]), // year
                    (attributes[1]), // country
                    (Integer.parseInt(attributes[2])),// tour winner name
                    (Integer.parseInt(attributes[3])),
                    (attributes[4]),
                    (Integer.parseInt(attributes[5])),
                    (attributes[6])
            );

            covid19Data.add(covid19Data1);

        }
        sc.close();
        return covid19Data;
    }
}
