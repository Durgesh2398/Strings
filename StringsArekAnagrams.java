package stringquestions;

import java.util.Scanner;

public class StringsArekAnagrams {

	static final int max =256;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		int k=sc.nextInt();
		if(output(str1,str2,k)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

	}

	static boolean output(String s1,String s2,int k) {
		
		if(s1.length()!=s2.length()) {
			return false;
		}
		
		int c1[]=new int[max];
		int c2[]=new int[max];
		int count =0;
		
		for(int i=0;i<s1.length();i++) {
			c1[s1.charAt(i)-'a']++;
		}
		for(int i=0;i<s1.length();i++) {
			c2[s2.charAt(i)-'a']++;
		}
		
		for(int i=0;i<max;i++) {
			if(c1[i]>c2[i]) {
				count=count+Math.abs(c1[i]-c2[i]);
			}
		}
		
		return (count<=k);
	}
}
