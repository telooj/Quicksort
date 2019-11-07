import org.junit.Test;
import static org.junit.Assert.*;

class QuicksortTest {

    public static <T extends Comparable<T>> void main(String[] args) {
        Integer[] testArray = {7, 1, 5};
        Quicksort.<Integer>quicksort(testArray, 0, testArray.length - 1);


        //Test 1: Als je de mediaan van 4, 1, en 7 berekent, krijg je 4 terug.
        assertEquals(java.util.Optional.ofNullable(Quicksort.getMedianOfThree(4, 1, 7)), 4);
        //Test 2: Als je de mediaan van 4, 1, en 7 berekent, krijg je niet het middelste getal(1) terug.
        assertNotEquals(java.util.Optional.ofNullable(Quicksort.getMedianOfThree(4, 1, 7)), 1);
        //Test 3: Als je een quicksort uitvoert op de array {7, 1, 5}, krijg je {1, 5, 7} terug.
        Integer[] expectedResult = {1, 5, 7};
        assertArrayEquals(testArray, expectedResult);
        //Test 4: Een negatieve waarde wordt bij Quicksort juist gesorteerd
        // Voegt een negatieve waarde toe aan de array
        Integer[] newTest4 = new Integer[testArray.length + 1];
        for (int i = 0; i < testArray.length; i++) {
            newTest4[i] = testArray[i];
        }
        newTest4[newTest4.length - 1] = -4;
        testArray = newTest4;
        Integer[] expectedResultB = {1, 5, 7, -4};
        assertArrayEquals(testArray, expectedResultB);
        Quicksort.<Integer>quicksort(testArray, 0, testArray.length - 1);
        Integer[] expectedResultC = {-4, 1, 5, 7};
        assertArrayEquals(testArray, expectedResultC);
        //Test 5:
//        Integer[] newTest5 = new Integer[testArray.length + 1];
//        for (int i = 0; i < testArray.length; i++) {
//            newTest5[i] = testArray[i];
//        }
//        newTest5[newTest5.length - 1] = -4;
//        testArray = newTest5;
//        Integer[] expectedResultD = {1, 5, 7, -4};
//        assertArrayEquals(testArray, expectedResultD);
//        Quicksort.<Integer>quicksort(testArray, 0, testArray.length - 1);
//        Integer[] expectedResultE = {-4, 1, 5, 7};
//        assertArrayEquals(testArray, expectedResultE);
    }
}