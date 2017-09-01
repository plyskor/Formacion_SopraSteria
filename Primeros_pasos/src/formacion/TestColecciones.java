package formacion;
import java.util.ArrayList;
import java.util.List;
public class TestColecciones {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> lista1,lista2,lista3;
		lista1=new ArrayList<String>();
		System.out.println("Tamaño : "+lista1.size());
		lista1.add("Martin");
		lista1.add("Andres");
		lista1.add("Eva");
		lista1.add("Tomas");
		lista1.add("Andres");
		lista1.remove("Andres");
		System.out.println("Tamaño : "+lista1.size());
		lista1.sort(null);
		for(String s:lista1){
			System.out.println(s);
		}
		String s1="Tomas",s2="andres";
		System.out.println("distancia : "+s2.compareTo(s1));
	}

}
