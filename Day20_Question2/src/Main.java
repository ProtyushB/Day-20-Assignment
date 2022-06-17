import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> city = new ArrayList<>();

        city.add("Kolkata");
        city.add("Mumbai");
        city.add("Bangalore");
        city.add("Chennai");
        city.add("Pune");

        Collections.sort(city, (s1, s2) -> s2.compareTo(s1));

        System.out.println(city);
    }
}
