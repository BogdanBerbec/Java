import java.util.ArrayList;

public class namesArrayList {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        for (int i=0; i<99999; i++) {
            names.add("Maria");
        }
        System.out.println(names.get(100));
    }
}
