import java.util.Scanner;

public class Generatii {
    public static void main(String[] args) {
        System.out.print("Va rugam introduceti varsta ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        String generatia;
        if (age < 0) {
            // generatia = "valoare incorecta";
            System.out.println("Varsta incorecta");
            return;
        } else if (age < 6) {
            generatia="ALfa";
        } else if (age <= 20) {
            generatia="Z";
        } else {
            generatia="Builders";
        }
        System.out.println("Generatia este  " + generatia);

  }
}
