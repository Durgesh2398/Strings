package stringquestions;
import java.util.*;
public class Non1RepeatingCharacter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String str =sc.next();
		for (int i = 0; i < str.length(); i++) {
			boolean unique = true;
			for (int j = 0; j < str.length(); j++) {
			    if (i != j && str.charAt(i) == str.charAt(j)) {
			    	unique = false;
			    	break;
			    }
			}
			if (unique) {
			    System.out.println("The first non repeated character in String is: " + str.charAt(i));
			    break;
			}
		}
	}
}