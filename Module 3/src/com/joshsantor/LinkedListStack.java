package com.joshsantor;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStack {
    private LinkedList<Players> stack;

    public LinkedListStack()
    {
        stack = new LinkedList<Players>();
    }

    public void push(Players player)
    {
        stack.push(player);
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public Players pop()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }
        return stack.pop();
    }

    public Players peek()
    {
        return stack.peek();
    }

    public void printStack()
    {
        ListIterator<Players> iterator = stack.listIterator();

        System.out.println("Printing Stack....");

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

}
