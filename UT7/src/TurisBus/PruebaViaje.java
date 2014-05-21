package TurisBus;

import java.util.ArrayList;
import java.util.List;

public class PruebaViaje {

	public static void main(String[] args) {
		List<Parada> paradas = new ArrayList<Parada>();
		Parada p1 = new Parada("Algodor",16,17);
		Parada p2 = new ParadaActividad("Aranjuez",18,19,"Visita el Museo de Aranjuez",20);
		paradas.add(p1);
		paradas.add(p2);
		Viaje trenTM = new Viaje("TREN01","TREN TOLEDO MADRID",15,20, paradas);
		
		System.out.println("Coste del viaje = " + trenTM.coste());

	}

}
