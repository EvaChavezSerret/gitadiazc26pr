package TurisBus;

import java.util.ArrayList;
import java.util.List;

public class Viaje {
	private String codigoV;
	private String nombreV;
	private int horaSV; //No hay medias horas
	private int horaLV;
	private List<Parada> listaParadas;
	public static final double PRECIO_H_V = 50D; //La D es para que coja un número sin decimales como Double. 
	public static final double PRECIO_P = 10D;
	

	public Viaje() {
		listaParadas = new ArrayList<Parada>();
	}

	public Viaje(String codigoV, String nombreV, int horaSV, int horaLV,
			List<Parada> listaParadas) {
		super();
		this.codigoV = codigoV;
		this.nombreV = nombreV;
		this.horaSV = horaSV;
		this.horaLV = horaLV;
		this.listaParadas = listaParadas;
	}

	public String getCodigoV() {
		return codigoV;
	}

	public void setCodigoV(String codigoV) {
		this.codigoV = codigoV;
	}

	public String getNombreV() {
		return nombreV;
	}

	public void setNombreV(String nombreV) {
		this.nombreV = nombreV;
	}

	public int getHoraSV() {
		return horaSV;
	}

	public void setHoraSV(int horaSV) {
		this.horaSV = horaSV;
	}

	public int getHoraLV() {
		return horaLV;
	}

	public void setHoraLV(int horaLV) {
		this.horaLV = horaLV;
	}

	public List<Parada> getListaParadas() {
		return listaParadas;
	}

	public void setListaParadas(List<Parada> listaParadas) {
		this.listaParadas = listaParadas;
	}

	@Override
	public String toString() {
		return "Viaje [codigoV=" + codigoV + ", nombreV=" + nombreV
				+ ", horaSV=" + horaSV + ", horaLV=" + horaLV
				+ ", listaParadas=" + listaParadas + "]";
	}
	
	public void anadirParada(Parada p){
		if (!listaParadas.contains(p)){ //El contains se puede usar al haber creado el equals en Parada
			listaParadas.add(p);
		}
	}
	
	public void quitarParada(Parada p){
		listaParadas.remove(p); //El remove se puede usar al haber creado el equals en Parada
	}
	
	public double coste(){
		double acumulado = 0D;
		int horaSalidaAnterior = horaSV;
		int acumulaHoras = 0;
		for(Parada p:listaParadas){
			acumulaHoras +=  p.getHoraBP()-horaSalidaAnterior;
			horaSalidaAnterior = p.getHoraSP();
			if(p.getClass()==ParadaActividad.class){
				acumulado += ((ParadaActividad)p).getPrecioA();
			}
		}
		//Final del viaje
		acumulaHoras += horaLV - horaSalidaAnterior;
		
		System.out.println("Horas: " + acumulaHoras);
		acumulado += acumulaHoras * PRECIO_H_V + listaParadas.size() * PRECIO_P;
		
		return acumulado;
	}

}
