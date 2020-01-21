package stringquestions;
import java.util.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class Isomorphic
{
	public static boolean isIsomorphic(String X, String Y){
		if (X.length() != Y.length()) {
			return false;
		}
		Map<Character, Character> map = new HashMap<>();
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < X.length(); i++){
			char x = X.charAt(i), y = Y.charAt(i);
			if (map.containsKey(x)){
				if (map.get(x) != y)
					return false;
			}
			else{
				if (set.contains(y))
					return false;
				map.put(x, y);
				set.add(y);
			}
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String X = sc.next();
		String Y = sc.next();
		if (isIsomorphic(X, Y)) {
			System.out.print(X + " and " + Y + " are Isomorphic");
		}
		else {
			System.out.print(X + " and " + Y + " are not Isomorphic");
		}
	}
}