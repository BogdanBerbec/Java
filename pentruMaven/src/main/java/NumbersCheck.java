public class NumbersCheck {

    public boolean verify(int a, int b, int c) {
        if (a == b+c  || c == a+b) {
            return true;
        } else {
            return false;
        }
    }
}
