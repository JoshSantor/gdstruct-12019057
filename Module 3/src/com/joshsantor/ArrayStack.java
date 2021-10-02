package com.joshsantor;

import java.util.EmptyStackException;

public class ArrayStack {
    private Players[] stack;
    private int top;

    public ArrayStack(int capacity){
        stack = new Players[capacity];
    }

    public void push(Players player)
    {
        if (top == stack.length) // stack is full
        {
            Players[] newStack = new Players[2 * stack.length];
            System.arraycopy(stack, 0,newStack,0, stack.length);
            stack = newStack;
        }

        stack[top++] = player;
    }

    public Players pop()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }

        Players poppedPlayer = stack[--top];
        stack[top] = null;
        return poppedPlayer;
    }

    public Players peek()
    {
        if (isEmpty())
        {
            throw  new EmptyStackException();
        }

        return stack[top - 1];
    }


    public boolean isEmpty()
    {
        return top == 0;
    }

    public void printStack()
    {
        System.out.println("Printing Stack");
        for (int i = top - 1; i > 0 ; i--)
        {
         System.out.println(stack[i]);
        }
    }
}
