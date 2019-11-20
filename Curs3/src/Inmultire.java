import java.util.Scanner;

public class Inmultire {
    public static void main(String[] args) {
        System.out.println("Introduceti numarul");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        while (i<=9) {
            System.out.println(i + "x" + n + "=" + i*n);
            i++;
        }

    }
}
