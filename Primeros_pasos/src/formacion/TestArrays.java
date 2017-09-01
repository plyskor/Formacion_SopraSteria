package formacion;

public class TestArrays {

	public static void main(String[] args) {
		int [] arra1, numPares = {2,4,6,8};
		//String [] nombres = {"Eva","Juan","Andres"};
		numPares[2]=16;
		arra1=new int[6];
		for(int i=0;i<numPares.length;i++){
			System.out.print("Elemento "+i+" : "+numPares[i]+" - ");
		}
		System.out.print("\n");
		int i=0;
		for(int item:numPares){
			System.out.print("Elemento "+i+" : "+item+" - ");
			i++;
		}
		System.out.print("\n");
		arra1[0]=3;
		arra1[1]=9;
		arra1[2]=15;
		i=0;
		for(int item:arra1){
			System.out.print("Elemento "+i+" : "+item+" - ");
			i++;
		}
	}

}
