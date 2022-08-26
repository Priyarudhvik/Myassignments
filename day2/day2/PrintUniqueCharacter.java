package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {
	public static void main(String[] args) {
		String name="Shanmugapriya";
		char[] charArray = name.toCharArray();
		Set<Character> ch=new HashSet<Character>();
		for(int i=0;i<charArray.length;i++) {
			ch.add(charArray[i]);
			
		}
		System.out.println(ch);
		
		
	}

}
