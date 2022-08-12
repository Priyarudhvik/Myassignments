package week1.day2;

import java.util.Arrays;

public class Missingno {
	public static void main(String[] args) {
		int[]arr= {1,2,3,4,7,6,8};
		int a=1;
		
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if (!(a==arr[i])) {
				System.out.println(a);
				
			}
			a++;
			
		}
		
	}

}
