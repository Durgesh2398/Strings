package stringquestions;
import java.util.*;
public class PlaindromeCheck {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String sr=sc.next();
		System.out.println(palindromech(sr));
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
