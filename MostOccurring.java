package stringquestions;
import java.util.*;
public class MostOccurring {

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
        int first = 0, second = 0; 
        for (i = 0; i < NO_OF_CHARS; i++) { 
            if (count[i] > count[first]) { 
                second = first; 
                first = i; 
            } 
            else if (count[i] > count[second] && count[i] != count[first]) 
                second = i; 
        } 
       
        return (char)second; 
    }
}
