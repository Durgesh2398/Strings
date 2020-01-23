package stringquestions;
import java.util.*;
public class ZerosAndOnes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String str=sc.next();
		int occ=0;
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		int count0=0;
		int count1=0;
		map.put(0,-1);
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='0') {
				count0++;
			}
			else {
				count1++;
			}
			if(!map.containsKey(count0-count1)) {
				map.put(count0-count1,i);
			}
			else {
				int l=i-map.get(count0-count1);
				occ=Math.max(occ, l);
			}
		}
		System.out.println(occ);
	}
}