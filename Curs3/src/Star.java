public class Star {
    public static void main(String[] args) {
        int ps=10;
        while (5>4) {
            for (ps = 1; ps <= 15; ps++) {
                System.out.print("\r");
                for (int i = 1; i <= ps; i++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (ps = 15; ps >= 1; ps--) {
                System.out.print("\r");
                for (int i = 1; i <= ps; i++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
