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
		Viaje busTM = new Viaje("BUS1","BUS TOLEDO MADRID",15,20, paradas);
		
		System.out.println(busTM.getNombreV());
		//Las horas las imprime porque lo he puesto en el método coste, en viaje.
		System.out.println("Coste del viaje = " + busTM.coste());

	}

}
