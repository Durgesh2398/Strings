package stringquestions;
import java.util.*;
public class MostOccurringChar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String str=sc.next();
		System.out.println(getSecondMostFreq(str));
	}
	static final int NO_OF_CHARS = 256; 
    static char getSecondMostFreq(String str) { 
    	int[] count = new int[NO_OF_CHARS]; 
        int i; 
        for (i=0; i< str.length(); i++) 
            (count[str.charAt(i)])++; 
        
        int max = -1; 
        char result = ' '; 
        for ( i = 0; i < str.length(); i++) { 
            if (max < count[str.charAt(i)]) { 
                max = count[str.charAt(i)]; 
                result = str.charAt(i); 
            } 
        } 
        return result; 
    }
}
