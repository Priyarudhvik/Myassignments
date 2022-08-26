package week3.day2;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class SecondLargest {
	public static void main(String[] args) {
		int[] data= {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer>values= new TreeSet<Integer>();
		for(int i=0;i<data.length;i++)
		{
			values.add(data[i]);
		
			
		}
		List<Integer> lt=new ArrayList<Integer>(values);
		int size = lt.size();
		System.out.println("the second largest element is:" +lt.get(size-2));
		
		
		
		
	}

}
