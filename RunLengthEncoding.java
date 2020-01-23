package stringquestions;
import java.util.*;
public class RunLengthEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=str.length();
		
		for(int i=0;i<n;i++) {
			int count=1;
			
			while( i<n-1 && str.charAt(i) == str.charAt(i+1) ) {
				count++;
				i++;
				
			}
			System.out.print(str.charAt(i)+""+count);
			
		}
	}
}
