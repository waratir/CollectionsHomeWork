package MyLinkedList;

import BubbleSort.MyBubbleSort;

import java.util.Collections;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) throws IllegalAccessException {
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        myLinkedList.add("test1");
        myLinkedList.add("test2");
        myLinkedList.add("test3");

        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.size());
        myLinkedList.remove(0);
        System.out.println(myLinkedList);


        MyLinkedList<Integer> myLinkedList2 = new MyLinkedList<Integer>();
        myLinkedList2.add(2);
        myLinkedList2.add(14);
        myLinkedList2.add(55);

        myLinkedList2.get(1);
        System.out.println(myLinkedList2.get(0));
        myLinkedList2.size();
        myLinkedList2.remove(1);
        System.out.println(myLinkedList2);

        MyLinkedList<Integer> myLinkedList3 = new MyLinkedList<Integer>();
        myLinkedList3.add(5);
        myLinkedList3.add(15);
        myLinkedList3.add(995);

        myLinkedList3.addAll(myLinkedList2);
        System.out.println(myLinkedList3);

        MyLinkedList<Double> myLinkedList4 = new MyLinkedList<Double>();
        myLinkedList4.add(5.2);
        myLinkedList4.add(6.2);
        myLinkedList4.add(6534.24);
        MyLinkedList<Double> myLinkedList5 = new MyLinkedList<Double>(myLinkedList4);
        System.out.println(myLinkedList5);


        MyLinkedList<String> myLinkedList6 = new MyLinkedList<String>();
        myLinkedList6.add("Tert");
        myLinkedList6.add("Alex");
        myLinkedList6.add("Jim");

        System.out.println("Sort Collection");
        System.out.println(MyBubbleSort.sort(myLinkedList6));
    }
}
