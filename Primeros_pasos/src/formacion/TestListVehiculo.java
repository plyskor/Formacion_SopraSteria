package formacion;
import java.util.ArrayList;
import java.util.Collections;

public class TestListVehiculo {
	public static void main(String[] args) {
		ArrayList<Vehiculo> l = new ArrayList<Vehiculo>();
		l.add(new Vehiculo("Seat", "600", "M-460534"));
		l.add(new Vehiculo("Renault", "12", "GU--4602-A"));
		l.add(new Vehiculo("Renault", "8", "M-0987-A"));
		Collections.sort(l);
		for(Vehiculo v:l){
			System.out.println(v);
		}

	}
}
