import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MaxScalarTest {
    private MaxScalar ms;

    @Before
    public void setUp() throws Exception {
       // System.out.println("This is setUp()");
        ms = new MaxScalar();
    }

    @After
    public void tearDown() throws Exception {
        //System.out.println("This is tearDown()");
    }

    @Test
    public void test() {
        int[]a = {1};
        int[]b = {1};
        assertEquals(1, ms.maximalScalarSum(a, b));
    }
    
    
    @Test
    public void testMaxScalarProductWithZeros() {
        int[]a = {1,0};
        int[]b = {0,1};
        assertEquals(1, ms.maximalScalarSum(a, b));
    }
    
    @Test
    public void testNumberOfDigits() {
       int num1 = 555;
        assertEquals(3, ms.getNumberOfDigits(num1));
    }
    
    @Test
    public void testGlueStrings() {
       Object [] stringsArr = {"I am", "Martin"};
        assertEquals("I am Martin", ms.glueObjects(" ",stringsArr));
    }
    
    @Test
    public void testGlueInts() {
       Object [] stringsArr = {1, 2,3,4,5};
        assertEquals("1 2 3 4 5", ms.glueObjects(" ",stringsArr));
    }
    
    @Test
    public void testGlueMixed() {
       Object [] stringsArr = {1, "2",3.0,4,"end"};
        assertEquals("1 2 3.0 4 end", ms.glueObjects(" ",stringsArr));
    }

}
