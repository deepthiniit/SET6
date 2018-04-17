package com.niit;
import java.util.ArrayList;
import java.util.Random;
	public class Program8 {
	    public static void main(String[] args) {

	        ArrayList<Integer> numbers = new ArrayList<Integer>();
	        Random r = new Random();

	        for(int i = 0 ; i < 4; i++){
	            numbers.add(r.nextInt());
	        }

	        while(numbers.size() > 1){
	            for(int i = 0; i < numbers.size();i++){
	                if(i%3 == 0){
	                    numbers.remove(i);
	                }
	            }
	        }
	    }
	}

