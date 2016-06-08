import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListExample {

	public static void main(String[] args) {
		
		List names = new ArrayList();
		
		names.add("ABC");
		names.add("DEF");
		names.add("GHI");
		names.add("JKL");
		names.add("MNO");
		names.add("PQR");
		names.add("STU");
		names.add("VWX");
		names.add("YZ");
		
		Iterator iterator = names.iterator();
		
		while(iterator.hasNext()){
			
			System.out.println(iterator.next());
			
		}
		
	}

}
