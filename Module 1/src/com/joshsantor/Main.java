package com.joshsantor;

public class Main {

    public static void main(String[] args) {
	int[] numbers = new int[10];

    //randomizing the array
    randomArray(numbers);

    System.out.println("Array before Sorting:");
    printIntArray(numbers);


    System.out.println("\n\nArray after Bubble Sorting:");
    descBubbleSort(numbers);
    printIntArray(numbers);


    System.out.println("\n\nArray after Selection Sorting:");
    descSelectionSort(numbers);
    printIntArray(numbers);
    }

    private static void printIntArray(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }


    private static void descBubbleSort(int[] arr){
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] < arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

    private static void descSelectionSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1 ; lastSortedIndex > 0 ; lastSortedIndex--)
        {
            int smallestIndex = 0;

            for (int i = 1; i <= lastSortedIndex; i++) {
                if (arr[i] < arr[smallestIndex])
                {
                    smallestIndex = i;
                }
            }
            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }
    private static void randomArray(int[] arr)
    {
        for (int i = 0 ; arr.length > i ; i++)
        {
            int randomInt = (int)Math.floor(Math.random()*(100-(-100)+1)+(-100));
            arr[i] = randomInt;
        }
    }
}
