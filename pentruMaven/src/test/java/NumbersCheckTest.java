import org.junit.Assert;
import org.junit.Test;

public class NumbersCheckTest {

    @Test
    public void testThat246AreGood() {
        NumbersCheck numbersCheck = new NumbersCheck();
        boolean result = numbersCheck.verify(2,4,6);
        Assert.assertEquals(true, result);
    }

    @Test
    public void testThat247AreNotGood() {
        NumbersCheck numbersCheck = new NumbersCheck();
        boolean result = numbersCheck.verify(2,4,7);
        Assert.assertEquals(false, result);
    }

    @Test
    public void testThat495AreGood() {
        NumbersCheck numbersCheck = new NumbersCheck();
        boolean result = numbersCheck.verify(4,9,5);
        Assert.assertEquals(true, result);
    }
}
