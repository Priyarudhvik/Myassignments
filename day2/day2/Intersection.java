package week3.day2;

import java.util.ArrayList;
import java.util.List;



public class Intersection {
public static void main(String[] args) {
	int []a= {3,2,11,4,6,7};
	int []b= {1,2,8,4,9,7};
	List<Integer> nu1=new ArrayList<Integer>();
	List<Integer> nu2=new ArrayList<Integer>();
	for(int i=0;i<a.length;i++) {
		nu1.add(a[i]);
	}
	for(int j=0;j<b.length;j++) {
		nu2.add(b[j]);
	}
	
		for(int k=0;k<nu1.size();k++) {
			for(int l=0;l<nu2.size();l++) {
				if (nu1.get(k)==nu2.get(l)){
					System.out.println("The intersection is:"+nu1.get(k));
				}
			}


		
	}
	
	
}
}
