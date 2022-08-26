package week3.day2;


import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
	public static void main(String[] args) {
		int[]data= {1,2,2,4,5,5,5,6,7,8,9,9,10};
		Set<Integer> values= new TreeSet<Integer>();
		for(int i=0;i<data.length;i++) {
			values.add(data[i]);
			
		}
		System.out.println(values);
		int size = values.size();
		for(int j=1;j<size;j++) {
			if(!values.contains(j)) {
				System.out.println("The missing number is:"+j);
				
			}
				
		
	}

}}
