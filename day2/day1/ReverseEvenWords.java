package week3.day1;

import java.util.Arrays;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String test="i am a software tester ";
		
		String[]split = test.split(" ");
		System.out.println(Arrays.toString(split));
		for(int i=0;i<split.length;i++)
		{
			if(i%2==1) {
		
		char[] charArray = split[i].toCharArray();
		for(int j=charArray.length-1;j>=0;j--) {
			System.out.print(charArray[j]);
		}
		
		System.out.print(" ");
			}else
			System.out.print(split[i]);
		}
		
				
			
			
		}}
	
	

