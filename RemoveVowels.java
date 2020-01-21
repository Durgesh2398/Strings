package stringquestions;
import java.util.*;
public class RemoveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String str = sc.nextLine();
		str=str.replaceAll("[aeiouAEIOU]","");
		System.out.println(str);
	}

}
