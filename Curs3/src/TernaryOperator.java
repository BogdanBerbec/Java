import java.time.LocalDateTime;
import java.time.LocalTime;

public class TernaryOperator {
    public static void main(String[] args) {
        int ora = LocalDateTime.now().getHour();
        int minute = LocalDateTime.now().getMinute();

        String perioada= ora >= 12 ? "pm":"am";
        System.out.println(ora + ":" + minute);
        System.out.println(perioada);

        for (int i=0; i<5; i++) {
            System.out.println(i);
        }

        for (int j=5; j>0; j--) {
            System.out.println(j);
        }
    }
}
