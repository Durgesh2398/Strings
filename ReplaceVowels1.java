package stringquestions;
import java.util.*;
public class ReplaceVowels1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String str=sc.nextLine();
		str=str.toLowerCase();
		System.out.println(replace(str));
	}
	public static String replace(String str) {
		String finals="";
		for(int i=0;i<str.length();i++) {
			if(!isVowel(str.charAt(i))) {
				finals=finals+str.charAt(i);
			}
		}
		return finals;
	}
	private static boolean isVowel(char c){
		String vowel="aeiou";
		for(int i=0;i<5;i++) {
			if(c==vowel.charAt(i)) {
				return true;
			}
		}
		return false;
	}
}
