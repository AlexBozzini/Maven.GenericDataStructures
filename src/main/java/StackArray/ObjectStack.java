package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements;
    private int top;
    private final static int DEFAULT_SIZE = 10;

    public ObjectStack(){
        this(DEFAULT_SIZE);
    }

    public ObjectStack(int initSize) {
        elements = new Object [initSize];
        top = -1;
    }


    public Boolean isEmpty(){
        return top == -1;
    }

    public void push(E item){
        elements[++top] = item;
    }

    public Object pop(){
        if (isEmpty()){
            throw new IndexOutOfBoundsException();
        }
        return elements[top--];
    }
}
