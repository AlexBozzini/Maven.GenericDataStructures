
package Pair;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;


/**
 * In here you must make firstLast, which will return a pair of the first element in the array list and the last
 * element in the arraylist.
 * You must also make a min method that returns the smallest item in the array list
 * A max method that returns the largest item in the arraylist
 * And a minmax method that returns a pair containing the largest and smallest items from the array list
 */

public class Arrays<E extends Comparable> {
    public static <E extends Comparable> Pair<E> firstLast(ArrayList<E> a) {
        return new Pair<>(a.get(0), a.get(a.size() - 1));
    }

    public static <E extends Comparable> E min(ArrayList<E> list){
        E min = list.get(0);
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).compareTo(min) < 0){
                min = list.get(i);
            }
        }
        return min;
    }

    public static <E extends Comparable> E max(ArrayList<E> list){
        E max = list.get(0);
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).compareTo(max) > 0){
                max = list.get(i);
            }
        }
        return max;
    }

    public static <E extends Comparable> Pair minMax(ArrayList<E> list){
        return new Pair(min(list), max(list));
    }
}

