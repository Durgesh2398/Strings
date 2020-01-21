package stringquestions;

import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		boolean[]alpha=new boolean[26];
		int index=0,flag=1;
		str=str.toLowerCase();
		System.out.println(str);
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
				index=str.charAt(i)-'a';
			}
			alpha[index]=true;
		}
		for(int i=0;i<26;i++) {
			if(alpha[i]==false) {
				flag=0;
			}
		}
		if(flag==1) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}

	}

}
