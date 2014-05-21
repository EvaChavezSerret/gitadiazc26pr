package TurisBus;

public class ParadaActividad extends Parada {
	
	private String nombreA;
	private double precioA;

	public ParadaActividad() {
		// TODO Auto-generated constructor stub
	}

	public ParadaActividad(String nombreP, int horaBP, int horaSP, String nombreA, double precioA) {
		super();
		setNombreP(nombreP);
		setHoraBP(horaBP);
		setHoraSP(horaSP);
		this.nombreA = nombreA;
		this.precioA = precioA;
	}

	public String getNombreA() {
		return nombreA;
	}

	public void setNombreA(String nombreA) {
		this.nombreA = nombreA;
	}

	public double getPrecioA() {
		return precioA;
	}

	public void setPrecioA(double precioA) {
		this.precioA = precioA;
	}

	@Override
	public String toString() {
		return "ParadaActividad [nombreA=" + nombreA + ", precioA=" + precioA
				+ "]";
	}

}
