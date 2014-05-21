package TurisBus;

public class Parada {
	
	private String nombreP;
	private int horaBP;
	private int horaSP;

	public Parada() {
		// TODO Auto-generated constructor stub
	}

	public Parada(String nombreP, int horaBP, int horaSP) {
		super();
		this.nombreP = nombreP;
		this.horaBP = horaBP;
		this.horaSP = horaSP;
	}

	public String getNombreP() {
		return nombreP;
	}

	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}

	public int getHoraBP() {
		return horaBP;
	}

	public void setHoraBP(int horaBP) {
		this.horaBP = horaBP;
	}

	public int getHoraSP() {
		return horaSP;
	}

	public void setHoraSP(int horaSP) {
		this.horaSP = horaSP;
	}

	@Override
	public String toString() {
		return "Parada [nombreP=" + nombreP + ", horaBP=" + horaBP
				+ ", horaSP=" + horaSP + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombreP == null) ? 0 : nombreP.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parada other = (Parada) obj;
		if (nombreP == null) {
			if (other.nombreP != null)
				return false;
		} else if (!nombreP.equals(other.nombreP))
			return false;
		return true;
	}

}
