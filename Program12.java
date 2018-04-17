package com.niit;

public class Program12 {
public static boolean StringAppend(char[] str1, char[] str2)
	    {
	        int n1 = str1.length;
	        int n2 = str2.length;
	  
	        if (n1 != n2)
	            return false;
	        quickSort(str1, 0, n1 - 1);
	        quickSort(str2, 0, n2 - 1);
	 
	        for (int i = 0; i < n1;  i++)
	            if (str1[i] != str2[i])
	                return false;
	  
	        return true;
	    }
	  
	    
	    static void exchange(char A[],int a, int b)
	    {
	        char temp;
	        temp = A[a];
	        A[a]   = A[b];
	        A[b]   = temp;
	    }
	  
	    static int partition(char A[], int si, int ei)
	    {
	        char x = A[ei];
	        int i = (si - 1);
	        int j;
	      
	        for (j = si; j <= ei - 1; j++)
	        {
	            if(A[j] <= x)
	            {
	                i++;
	                exchange(A, i, j);
	            }
	        }
	        exchange (A, i+1 , ei);
	        return (i + 1);
	    }
	  
	   
	    static void quickSort(char A[], int si, int ei)
	    {
	        int pi;    
	        if(si < ei)
	        {
	            pi = partition(A, si, ei);
	            quickSort(A, si, pi - 1);
	            quickSort(A, pi + 1, ei);
	        }
	    }
	  
	    
	    public static void main(String args[])
	    {
	        char str1[] = {'h','e','l','l','o'};
	        char str2[] = {'d','e','l','h','i'};
	        if (StringAppend(str1, str2))
	            System.out.println("The two strings are"+
	                             " anagram of each other");
	        else
	            System.out.println("The two strings are not"+
	                               " anagram of each other");
	    }
	}


