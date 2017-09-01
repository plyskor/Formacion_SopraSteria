package formacion;

public class Cadenas {

	public static void main(String[] args) {
		String s1="tomas";
		String s2="tomas";
		if(s1==s2)
			System.out.println("Iguales");
		else
			System.out.println("Distintos");
		s1= new String("tomas");
		s2= new String("tomas");
		if(s1==s2)
			System.out.println("Iguales new");
		else
			System.out.println("Distintos new");
	}

}
