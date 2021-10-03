package com.joshsantor;

import java.util.EmptyStackException;

public class CardStack {
    private Cards[] stack;
    private int top;


    public CardStack(int capacity) {
        stack = new Cards[capacity];
    }

    public void push(Cards card) {
        if (top == stack.length) // stack is full
        {
            Cards[] newStack = new Cards[2 * stack.length];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }

        stack[top++] = card;
    }

    public Cards pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        Cards poppedCard = stack[--top];
        stack[top] = null;
        return poppedCard;
    }

    public Cards peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }


    public boolean isEmpty() {
        return top == 0;
    }

    public void printStack() {
        for (int i = top - 1; i > 0; i--) {
            System.out.print(i + ": ");
            System.out.println(stack[i]);
        }
    }
}
