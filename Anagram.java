//An anagram of a string is another string that contains same characters, 
//only the order of characters can be different. 
//For example, “abcd” and “dabc” are anagram of each other.
package stringquestions;
import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String st1=sc.next();
		String st2=sc.next();
		System.out.println(anagramcheck(st1,st2));
	}
	static boolean anagramcheck(String st1,String st2) {
		if(st1.length()!=st2.length()) {
			return false;
		}
		char c1[]=st1.toCharArray();
		Arrays.sort(c1);
		char c2[]=st2.toCharArray();
		Arrays.sort(c2);
		for(int i=0;i<st1.length();i++) {
			if(c1[i]!=c2[i]) {
				return false;
			}
		}
		return true;
	}

}
