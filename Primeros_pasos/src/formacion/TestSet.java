package formacion;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



public class TestSet {

	public static void main(String[] args) {
		Set<String> set1,set2;
		set1=new HashSet<String>();
		set2=new TreeSet<String>();
		set1.add("Eva");
		set1.add("Andres");
		set1.add("Tomas");
		for(String s:set1) {
			System.out.println(s);
		}
		set2.add("Eva");
		set2.add("Andres");
		set2.add("Tomas");
		for(String s:set2) {
			System.out.println(s);
		}
		Iterator<String> it = set1.iterator();
		System.out.println("##########ITERATOR SET1###########");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		it = set2.iterator();
		System.out.println("##########ITERATOR SET2###########");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
