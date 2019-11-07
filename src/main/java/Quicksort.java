public class Quicksort {

    public static <T extends Comparable<T>> void quicksort(T[] array, int a, int b) {
        if (a < b) {
            int i = a;
            int j = b;
            int middle = (i + j)/2;
            T pivot = getMedianOfThree(array[i], array[middle], array[j]);

            while (i <= j) {
                while (array[i].compareTo(pivot) < 0) i++;
                while (pivot.compareTo(array[j]) < 0) j--;
                if (i <= j) {
                    T tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                    i++;
                    j--;
                }
            }

            quicksort(array, a, j);
            quicksort(array, i, b);
        }

    }

    public static <T extends Comparable<T>>T getMedianOfThree(T first, T middle, T last) {
        if (first.compareTo(middle) > 0) {
            if (middle.compareTo(last) > 0) {
                return middle;
            } else if (first.compareTo(last) > 0)  {
                return last;
            } return first;
        } else {
            if (first.compareTo(last) > 0) {
                return first;
            } else if (middle.compareTo(last) > 0) {
                return last;
            } return middle;
        }
    }

    public static void main(String[] args) {
        Integer[] array = {12, 18, 3, 7, 87, 44, 63, 50};
        Quicksort.<Integer>quicksort(array, 0, array.length - 1);
        for (int k = 0; k < array.length; k++) System.out.println(array[k]);
    }
}
