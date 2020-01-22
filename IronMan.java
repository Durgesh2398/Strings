package stringquestions;
import java.util.*;
public class IronMan {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String str=sc.nextLine();
		
		str=str.replaceAll("[^a-zA-Z0-9\\\\s+]", "");
		System.out.println(str);
		
		str=str.toLowerCase();
		System.out.println(palindromech(str));
	}
	static boolean palindromech(String str) {
		int n=str.length();
		if(n==0) {
			return true;
		}
		return check(str,0,n-1);
	}
	static boolean check(String str,int start,int end) {
		if(start==end) {
			return true;
		}
		if((str.charAt(start)!=str.charAt(end))) {
			return false;
		}
		
		if(start<end+1) {
			return check(str,start+1,end-1);
		}
		return true;
	}
}
