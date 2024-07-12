package BubbleSort;

import MyLinkedList.MyLinkedList;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class MyBubbleSort<T> {
    public static <T extends Comparable<T>> MyLinkedList<T> sort(MyLinkedList<T> values) throws IllegalAccessException {
        Comparator<T> comparator = Comparable::compareTo;
        Object [] array = new Object[values.size()];
        for (int i = 0; i < values.size(); i++) {
            array[i] = values.get(i);
        }

        boolean isSorted = false;
        T saveValue;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (comparator.compare((T) array[i], (T) array[i + 1]) > 0) {
                    isSorted = false;
                    saveValue = (T) array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = saveValue;
                }
            }
        }

        MyLinkedList<T> sortedList = new MyLinkedList<T>();
        for (int i = 0; i < array.length; i++) {
            sortedList.add((T) array[i]);
        }
        return sortedList;
    }
}
