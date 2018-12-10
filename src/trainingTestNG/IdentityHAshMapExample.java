package trainingTestNG;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.TreeMap;

public class IdentityHAshMapExample {
	
	
	public static void main(String[] args){
		
	
	
		HashMap hm = new HashMap();
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		hm.put(i1, "Rahul");
		hm.put(i2, "Mendiratta");
		//JVM will use .equals method for key comparison so we will get O/P 10,Mendiratta
		
		System.out.println(hm.toString());
		
		IdentityHashMap ihm = new IdentityHashMap();
		ihm.put(i1, "Rahul");
		ihm.put(i2, "Mendiratta");
		
		System.out.println(ihm.toString());
		//JVM will use ==  for key comparison which is meant for reference comparison
		
		TreeMap t = new TreeMap(new MyComparator());
		
	}

}
