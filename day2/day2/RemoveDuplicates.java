package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {
public static void main(String[] args) {
	String name="paypal";
	char[] charArray = name.toCharArray();
	Set<Character> chset= new TreeSet<Character>();
	Set<Character> dupchset= new TreeSet<Character>();
	for(int i=0;i<charArray.length;i++) {
		if(chset.contains(charArray[i]))
			dupchset.add(charArray[i]);
		else
		chset.add(charArray[i]);
	}
	System.out.println(dupchset);
	System.out.println(chset);
	
}
}
