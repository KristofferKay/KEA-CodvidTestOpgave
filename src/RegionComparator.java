import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class RegionComparator implements Comparator<Covid19Data> {

    ArrayList<Covid19Data> covid19Data = new ArrayList<>();

    @Override
    public int compare(Covid19Data o1, Covid19Data o2) {
       return o1.getRegion().compareTo(o2.getRegion());

    }
}
