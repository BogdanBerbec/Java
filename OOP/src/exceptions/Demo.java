package exceptions;

public class Demo {
    public static void main(String[] args) {
        int y = 10;
        try {
            int a = 1 / 0;
            y = 5;
            System.out.println(a);
        } catch(Exception e) {
            System.out.println("Impartirea nu poate fi facuta");
        }
        System.out.println(y);

    }
}
