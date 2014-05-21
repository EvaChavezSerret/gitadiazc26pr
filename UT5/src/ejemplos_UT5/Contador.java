package ejemplos_UT5;

public class Contador {
	private long acumulador;
	
	public long getContador(){
		return acumulador;
	}
	
	public void setContador(int contador){
		acumulador = contador;
	}
	
	public void incrementar(){
		acumulador++;
	}
}
