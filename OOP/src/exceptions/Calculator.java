package exceptions;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws InterruptedException {
            Thread.sleep(1000);


        Scanner reader = new Scanner(System.in);
        System.out.print("a=");
        int a = reader.nextInt();
        System.out.print("b=");
        int b = reader.nextInt();
        try {
            try {
                divide(a, b);
            } catch (InvalidParameterException e) {
                e.printStackTrace();
            }
        } catch (/*ArithmeticException*/ /*InstantiationException*/IndexOutOfBoundsException e) {
//            e.printStackTrace();
            System.out.println("Operatie invalida");
        } /* catch (InvalidParameterException e) {
            e.printStackTrace();
        }*/
    }

    private static void divide(int a, int b) throws InvalidParameterException /*e bine sa aruncam exceptii specifice*/ {
        if (b==0) {
            throw new /*Exception*/ InvalidParameterException(); /*nu are constructor deci nu are parametru*/
        }
        int c = a / b;
        System.out.println(a + "/" + b + "=" + c);
    }
}
