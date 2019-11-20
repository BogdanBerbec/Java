public class Choco {
    public static void main(String[] args) {
        int money = 0;
        int chocolates = 0;
        int chocolatePrice = 1;
/*        while(money > chocolatePrice) {
            chocolates++;
            money -= chocolatePrice;
        }
        System.out.println("I have " + chocolates + " chocolates");*/

        do {
            chocolates++;
            money -= chocolatePrice;
        } while(money > chocolatePrice);
        System.out.println("I have " + chocolates + " chocolates");

        int number = 0;
        while (number<5) {
            if (number == 3) {
                continue;
            }
            System.out.println(number);
            number++;
        }

    }
}
