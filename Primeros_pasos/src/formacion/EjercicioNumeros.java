package formacion;

public class EjercicioNumeros {

	public static void main(String[] args) {
		int none=0,mul3=0,mul7=0,mul3and7=0;
		System.out.print("Múltiplos de 3 y 7 por igual: ");
		for(int i=1;i<=250;i++){
			if(i%21==0){
				mul3++;mul7++;mul3and7++;
				System.out.print(i+" ");
			}else if(i%3==0) mul3++;
			else if(i%7==0) mul7++;
			else none++;
		}
		System.out.println("\nEn total hay "+mul3and7+" multiplos de 3 y 7 a la vez");
		System.out.println("En total hay "+mul3+" multiplos de 3");
		System.out.println("En total hay "+mul7+" multiplos de 7");
		System.out.println("En total hay "+ none + " que no son multiplos de 3 ni 7");
	}

}
