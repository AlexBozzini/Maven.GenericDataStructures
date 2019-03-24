package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {
    private ArrayList<E> elements;


    public Stack(ArrayList<E> elements){
        this.elements = elements;
    }

    public Stack(){
        elements = new ArrayList<>();
    }

    public Boolean isEmpty(){
        return elements.size() == 0;
    }

    public E push(E item){
        elements.add(item);
        return item;
    }

    public E pop(){
        elements.remove(elements.size() - 1);
        System.out.println(elements.toString());
        return elements.get(0);
    }
}
