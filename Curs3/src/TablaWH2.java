import javax.swing.*;

public class TablaWH2 {
    public static void main(String[] args) {
        int w=20;
        int h=10;
        for (int i=1; i<=h; i++) {
            for (int j=1; j<=w; j++) {
                if ((j==1 || j==w) || (i==1 || i==h)) {
                    System.out.print("#");
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }

    }
}
