package BubbleSort;

public class MyBubbleSort {
    public static int[] sort(int[] values) {
        boolean isSorted = false;
        int saveValue;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < values.length - 1; i++) {
                if (values[i] > values[i + 1]) {
                    isSorted = false;
                    saveValue = values[i];
                    values[i] = values[i + 1];
                    values[i + 1] = saveValue;
                }
            }
        }
        return values;
    }
}
