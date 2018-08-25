import org.junit.Test;
import static org.junit.Assert.*;

import static org.junit.Assert.assertTrue;

public class TrickyAverageTest {
    @Test
    public void getTrickyAvg_testCase1() {
        int[] x = new int[]{1, 22, 3, 8, 14, 6};
        TrickyAverage y = new TrickyAverage(x);
        assertEquals(11, y.getTrickyAvg(x));

    }

    @Test
    public void getTrickyAvg_testCase2() {
        int[] x = new int[]{1, 22, 3, 8, 14, 6};
        TrickyAverage y = new TrickyAverage(x);
        assertTrue(y.getTrickyAvg(x)>=2);

    }
}
