import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;


public class SumTest {
    private ArrayList<Integer> myList = new ArrayList<Integer>();
    private ArrayList<Integer> myEmptyList = new ArrayList<Integer>();
    private ArrayList<Integer> myOneElementList = new ArrayList<Integer>();
    private Sum sum1;


    @Before
    public void makeAList() {
        this.sum1 = new Sum();

        myList.add(1);
        myList.add(3);
        myList.add(7);
        myList.add(4);
        myList.add(9);
        myOneElementList.add(null);
    }


    @Test
    public void sum() {

        assertEquals(24, sum1.sum(myList));

    }

    @Test
    public void sum2() {

        assertEquals(24, sum1.sum(myEmptyList));

        // correction --> changing expected 24 to 0
    }

    @Test
    public void sum3 (){

        assertEquals(24, sum1.sum(myOneElementList));

        // correction -->changing @Test to @Test (expected = NullPointerException.class)

    }


}
