package week3.day2;

public class ChangeOddIndexToUppercase {
	public static void main(String[] args) {
		String test="changename";
		String Modified="";
		char[] ar = test.toCharArray();
		for(int i=0;i<ar.length;i++) {
			if(i%2==1) {
				char upperCase = Character.toUpperCase(ar[i]);
				Modified=Modified+upperCase;
			
			}
			else {
				Modified=Modified+ar[i];
			}
			System.out.println("The modified string is :"+Modified);
		}
		
		}
	}

