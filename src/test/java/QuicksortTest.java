import org.junit.Test;
import static org.junit.Assert.*;

public class QuicksortTest {

    @Test
    public <T extends Comparable<T>> void testMethodGetMedianOfThree() {
        //Als je de mediaan van 4, 1, en 7 berekent, krijg je 4 terug.
        Integer[] testArray = new Integer[]{4, 1, 7};
        assertEquals(testArray[0], Quicksort.getMedianOfThree(testArray[0], testArray[1], testArray[2]));
    }

    @Test
    public void  testQuicksort() {
        //Als je een quicksort uitvoert op de array {7, 10, 17, 4, 1, 5}, krijg je {1, 4, 5, 7, 10, 17} terug.
        Integer[] testArray = new Integer[]{7, 10, 17, 4, 1, 5};
        Quicksort.<Integer>quicksort(testArray, 0, testArray.length - 1);
        Integer[] expectedResult = {1, 4, 5, 7, 10, 17};
        assertArrayEquals(expectedResult, testArray);
    }

    @Test
    public void testQuicksortWithNegativeValues() {
        //Een negatieve waarde wordt bij Quicksort juist gesorteerd
        Integer[] testArray = new Integer[]{7, -10, 17, 4, 1, 5};
        Quicksort.<Integer>quicksort(testArray, 0, testArray.length - 1);
        Integer[] expectedResult = {-10, 1, 4, 5, 7, 17};
        assertArrayEquals(expectedResult, testArray);
    }

    @Test
    public void testQuicksortEmptyArray() {
        Integer[] testArray = new Integer[]{};
        Quicksort.<Integer>quicksort(testArray, 0, testArray.length - 1);
        Integer[] expectedResult = {};
        assertArrayEquals(expectedResult, testArray);
    }

    @Test
    public void testQuicksortSortingDuplicates () {
        Integer[] testArray = new Integer[]{4, 2, 7, 4, 9};
        Quicksort.<Integer>quicksort(testArray, 0, testArray.length - 1);
        Integer[] expectedResult = {2, 4, 4, 7, 9};
        assertArrayEquals(expectedResult, testArray);
    }
}