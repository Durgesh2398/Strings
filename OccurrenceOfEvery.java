package stringquestions;
import java.util.*;
public class OccurrenceOfEvery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String str=sc.next();
		str=str.toLowerCase();
		int l=str.length();
		
		int count[]=new int[256];
		
		for(int i=0;i<l;i++) {
			count[str.charAt(i)]++;
		}
		
		char arr[]=new char[l];
		
		for(int i=0;i<l;i++) {
			arr[i]=str.charAt(i);
			int flag=0;
			for(int j=0;j<=i;j++) {
				if(str.charAt(i)==arr[j]) {
					//System.out.println(str.charAt(i) +""+count[str.charAt(i)]);
					flag++;
				}
			}
			if(flag==1) {
				System.out.println(str.charAt(i)+" "+ count[str.charAt(i)]);
				//break;
			}
		}
	}
}
