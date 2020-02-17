package stringquestions;

import java.util.Scanner;

public class AllPaternBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
		char ch[]=str.toCharArray();
		output(ch,0);

	}
	static void output(char ch[],int index) {
		if(index==ch.length) {
			System.out.println(ch);
			return;
		}
		if(ch[index]=='?') {
			ch[index]='0';
			output(ch,index+1);
			
			ch[index]='1';
			output(ch,index+1);
			
			ch[index]='?';
		}
		else {
			output(ch,index+1);
		}
	}

}
