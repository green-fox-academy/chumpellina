import static org.junit.Assert.*;

public class AppleTest {

    Apple appleOne = new Apple("apple");

    @org.junit.Test
    public void printApple() {
        assertEquals(appleOne.printApple(), "apple");
    }
}