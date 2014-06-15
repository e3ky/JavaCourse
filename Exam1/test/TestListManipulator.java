import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestListManipulator {
    List<Integer> sourceList;

    @Before
    public void setUp() throws Exception {
        sourceList = new ArrayList<>();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSortedCopyOfList1() {
        sourceList.add(1);
        sourceList.add(7);
        sourceList.add(2);
        sourceList.add(7);
        sourceList.add(9);
        sourceList.add(8);
        sourceList.add(1);

        List<Integer> sortedList = ListManipulator.sort(sourceList);
        List<Integer> expectedList = Arrays.asList(1, 1, 2, 7, 7, 8, 9);

        assertTrue(sortedList.equals(expectedList) && sourceList != sortedList);
    }

    @Test
    public void testSortedCopyOfList2() {
        sourceList.add(1);
        sourceList.add(1);
        sourceList.add(1);

        List<Integer> sortedList = ListManipulator.sort(sourceList);
        List<Integer> expectedList = Arrays.asList(1, 1, 1);

        assertTrue(sortedList.equals(expectedList) && sourceList != sortedList);
    }

    @Test
    public void testReverseSortedCopyOfList1() {
        sourceList.add(1);
        sourceList.add(7);
        sourceList.add(2);
        sourceList.add(7);
        sourceList.add(9);
        sourceList.add(8);
        sourceList.add(1);

        List<Integer> sortedList = ListManipulator.reverse(sourceList);
        List<Integer> expectedList = Arrays.asList(9, 8, 7, 7, 2, 1, 1);

        assertTrue(sortedList.equals(expectedList) && sourceList != sortedList);
    }

    @Test
    public void testReverseSortedCopyOfList2() {
        sourceList.add(1);
        sourceList.add(1);
        sourceList.add(1);

        List<Integer> sortedList = ListManipulator.sort(sourceList);
        List<Integer> expectedList = Arrays.asList(1, 1, 1);

        assertTrue(sortedList.equals(expectedList) && sourceList != sortedList);
    }
    @Test
    public void testIfListIsMonotonic1() {
   

        List<Integer> list = Arrays.asList(1, 2,3,4,5,6);

        assertTrue(ListManipulator.isMonotonic(list));
    }
    @Test
    public void testIfListIsMonotonic2() {
   

        List<Integer> list = Arrays.asList(6,5,4,3,2,1,1,1);

        assertTrue(ListManipulator.isMonotonic(list));
    }
    @Test
    public void testIfListIsMonotonic3() {
   

        List<Integer> list = Arrays.asList(1,2,1,4,5,4);

        assertFalse(ListManipulator.isMonotonic(list));
    }
    
}
