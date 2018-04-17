package com.niit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program10 {
	public static void main(String[] args){
		String input="Hi this is cognizant Academy";
		String output="Hello this is a trainee";
		int i=0;
		Pattern p=Pattern.compile("this");
		Matcher m=p.matcher(input);
		while(m.find()){
			i++;
		}
		System.out.println(i);		
	}

}
