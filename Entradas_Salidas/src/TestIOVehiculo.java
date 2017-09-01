import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestIOVehiculo {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Vehiculo v2,v1 = new Vehiculo("Seat", "600", "M-460534");
		ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("vehiculo.dat"));
		oos.writeObject(v1);
		oos.close();
		ObjectInputStream ois= new ObjectInputStream(new FileInputStream("vehiculo.dat"));
		v2=(Vehiculo) ois.readObject();
		System.out.println(v2);
	}

}
