package com.Collection.ArrayListAndLinkedList;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedList;
public class Test {

    public static void main(String[] args) throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < 11; i++) {
            list.add(i);
            System.out.format("Size: %2d, Capacity: %2d%n",
                              list.size(), getCapacity(list));
        }
    }

    static int getCapacity(LinkedList<Integer> list) throws Exception {
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        return ((Object[]) dataField.get(list)).length;
    }
}