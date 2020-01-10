import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class namesRezolvare {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Maria");
        names.add("Maria");
        names.add("Gabi");
        names.add("Maria");

        HashMap<String, Integer> counters = new HashMap<>();
        for (String x : names) {
            if (counters.get(x) == null) {
                counters.put(x, 1);
            } else {
                int c = counters.get(x);
                c = c+1;
                counters.put(x, c);
            }
        }
        System.out.println(counters);
//        int c = 0;
//        for (String x : names) {
//            for (String y : names) {
//                if (x.equals(y)) {
//                    c = c + 1;
//                }
//                System.out.println(x + " " + c);
//            }
//        }

    }
}
