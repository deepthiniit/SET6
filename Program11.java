package com.niit;

public class Program11 {
	public static void rvereseArray(String[] arr, int a, int b)
    {
        String temp;
        if (a >= b)
            return;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        rvereseArray(arr, a+1, b-1);
    }
 
  public static void printArray(String[] arr, int size)
    {
        for (int i=0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
 
    public static void main (String[] args) {
    	String  arr[] = {"red","green","blue","ivory"};
        printArray(arr,3);
        rvereseArray(arr, 0, 2);
        System.out.println("Reversed array is ");
        printArray(arr, 3);
    }
}
