package formacion;

public class ArraBi {

	public static void main(String[] args) {
		String [] dias={"Lunes","Martes","Miercoles"};
		String [][] menuSemanal= {{"Macarrones","Pollo","Sandía"},{"Cocido completo","Helado"},{"Repollo","Cordero","Melón","Café"}};
		for(int i=0;i<menuSemanal.length;i++){
			System.out.print(dias[i]+" :\t");
			for(int j=0;j<menuSemanal[i].length;j++){
				System.out.print(menuSemanal[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}

}
 