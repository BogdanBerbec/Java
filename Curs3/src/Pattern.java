public class Pattern {
    public static void main(String[] args) {
        for (int n=1; n<=9; n++) {
            if (n==3 || n==7) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int n=1; n<=9; n++) {
            if (n==1 || n==5 || n==9) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
        System.out.println();

        for (int i=1; i<=9; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int j=1; j<=9; j++) {
            if (j==1 || j==9) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
        System.out.println();
            for (int k=1; k<=9; k++) {
            if (k==1 || k==2 || k==8 || k==9) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
        System.out.println();

            for (int l=1; l<=9; l++) {
            if (l==1 || l==2 || l==3 || l==7 || l==8 || l==9) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
        System.out.println();
        for (int m=1; m<=9; m++) {
            if ((1 == m || m == 2 || m == 3 || m == 4 || m == 6 || m == 7 || m == 8 || m == 9)) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
        System.out.println();


    }
}
