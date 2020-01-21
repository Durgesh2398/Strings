//check the rotation of string is equal to another string
package stringquestions;
import java.util.*;
public class RotatingStringCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String st1=sc.next();
		String st2=sc.next();
		System.out.println(checkittrue(st1,st2));
	}
	static boolean checkittrue(String str,String str1) {
		if(str.length()!=str1.length()) {
			return false;
		}
		for(int i=0;i<str.length();i++) {
			str = str.substring(1)+str.charAt(0);
			System.out.println(str);
			if(str.compareTo(str1)==0) {
				return true;
			}
		}
		return false;
	}

}
