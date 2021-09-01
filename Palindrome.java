import java.util.*;

public class palindrome {
	public static void main(String[] args) {
		String original, reverse ="";
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string");
		original = in.nextLine();
		int L = original.length();
		
		for( int i=L-1 ; i>=0; i--)
		   reverse= reverse+ original.charAt(i);
		   
		 if (original.equals(reverse))
		   System.out.println("palindrom"+ " "+original +" ="+ reverse);
		   else 
		   System.out.println("not");
		
	}
} 
