package stringquestions;
import java.util.*;
public class ArrayOfWords {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		String[] arr=new String[n];
		int maxc=0;
		String result="";
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextLine();
		}
		HashMap<String,Integer>map=new HashMap<>();
		for(int i=0;i<n;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i],1);
				if(maxc<1) {
					maxc=1;
					result=arr[i];
				}
			}
			else{
				int count=map.get(arr[i])+1;
				map.put(arr[i],map.get(arr[i])+1);
				if(maxc<count) {
					maxc=count;
					result=arr[i];
				}
			}
		}
		System.out.println(result+" times "+maxc);
	}
}