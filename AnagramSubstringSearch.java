package stringquestions;

import java.util.Scanner;

public class AnagramSubstringSearch {
	
	static final int max = 256;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		search(str2,str1);
	}
	
	static void search(String s1,String s2) {
		int a=s1.length();
		int b=s2.length();
		
		char []c1=new char[max];
		char []c2=new char[max];
		
		for(int i=0;i<a;i++) {
			(c1[s1.charAt(i)])++;
			(c2[s2.charAt(i)])++;
		}
		
		for(int i=a;i<b;i++) {
			if(compare(c1,c2)) {
				System.out.println("found at index" +(i-a));
			}
			(c2[s2.charAt(i)])++;
			(c2[s2.charAt(i-a)])--;
		}
		
		if(compare(c1,c2)) {
			System.out.println("found at index"+(b-a));
		}
	}
	
	static boolean compare(char a1[],char a2[]) {
		for(int i=0;i<max;i++) {
			if(a1[i]!=a2[i]) {
				return false;
			}
		}
		return true;
	}

}
