package formacion;

public class Saludo {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		byte b;
		short s1, s2, s3 = 345;
		int i = 2040000000, j=0,k=0;
		long l = 2500000000L;
		float f1 = 23.5f, f2=12;
		double d =1.2e-234;
		char c1,c2,c3;
		boolean bol = true;
		c1='a';
		c2='\u0061';
		c3= 97;
	    System.out.println(c1 + " - " + c2 + " - " + c3);
	    j=7/2;
	    System.out.println(j);
	    f2 = (float)7.0/2;
	    System.out.println("F2 " + f2);
	}
}
