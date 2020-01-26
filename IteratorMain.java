package stringquestions;
import java.util.Iterator;
import java.util.LinkedList;
public class IteratorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> animals =new LinkedList<String>();
		
		animals.add("tiger");
		animals.add("fox");
		animals.add("lion");
		animals.add("monkey");
		animals.add("elephant");
		
		for(String animal:animals) {
			System.out.println(animal);
		}
		
		
		Iterator<String> itr=animals.iterator();
		
		//haxnext(), next(), remove()
		
		String value=itr.next();
		System.out.println(value);
		
		value=itr.next();
		System.out.println(value);
		
		value=itr.next();
		System.out.println(value);
		
		value=itr.next();
		System.out.println(value);
		
		value=itr.next();
		System.out.println(value);
		boolean val=itr.hasNext();
		System.out.println(val);
		
		
		while(itr.hasNext()) {
			String valu=itr.next();
			System.out.println(valu);
			
			if(valu.contentEquals("elephant")) {
				itr.remove();
			}
			
		}
		for(String animal:animals) {
			System.out.println(animal);
		}
	}

}
