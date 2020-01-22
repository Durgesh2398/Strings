package stringquestions;
import java.util.*;
public class ArrayOfWords {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		String []str=new String[t];
		for(int i=0;i<t;i++) {
			str[i]=sc.next();
		}
		int count=0,max=0,store;
		int arr[]=new int[t];
		for(int i=0;i<t;i++) {
			for(int j=0;j<t;j++) {
				if(i!=j&&str[i]==str[j]) {
					count++;
					max=count;
				}
				
			}
		}
		//String []words = str.split(" ");
		//int n=words.length;
		/*int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=0;
		}
		for(int i=0;i<words.length;i++) {
			for(int j=0;j<words.length;j++) {
				if(i!=j&&words[i]==words[j]) {
					arr[i]++;
				}
			}
		}
		int max=arr[0];
		int index=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max =arr[i];
				index=i;
			}
		}
		System.out.println(max);
		System.out.println(words[index]);*/
	}
}