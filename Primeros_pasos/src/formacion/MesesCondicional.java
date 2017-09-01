package formacion;

public class MesesCondicional {

	public static void main(String[] args) {
		int mes=2;
		if(mes<=0||mes>12){
			System.out.println("El número introducido ha de estar entre 1 y 12");
			return;
		}
		if(mes==2){
			System.out.println("El mes " + mes + " tiene 28/29 días");
			return;
		}
		if(mes<=7&&mes%2==1){
			System.out.println("El mes " + mes + " tiene 31 días");
			return;
		}
		if(mes>7&&mes%2==0){
			System.out.println("El mes " + mes + " tiene 31 días");
			return;
		}
		System.out.println("El mes " + mes + " tiene 30 días");
		return;
	}
}
