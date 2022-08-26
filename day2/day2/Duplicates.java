package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class Duplicates {
	public static void main(String[] args) {
		int [] data= {4,3,6,8,29,1,2,4,7,8};
		Set<Integer> values=new TreeSet<Integer>();
		for(int i=0;i<data.length;i++) {
			if(values.contains(data[i]))
				System.out.println("the duplicates are :"+data[i]);
			else
			values.add(data[i]);
		}
		
	}

}
