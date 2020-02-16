package stringquestions;

import java.util.Scanner;

public class LongAnagramBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		if(output(a,b)) {
			System.out.print("yes");
		}
		else {
			System.out.print("no");
		}
	}
	
	static boolean output(long a,long b) {
		return (Long.bitCount(a)==Long.bitCount(b));
	}

}
