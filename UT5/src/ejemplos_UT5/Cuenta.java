package ejemplos_UT5;

public class Cuenta {
	
	public float saldo;
	
	public void ingresarDinero(float metido){
		saldo = saldo + metido;
	}
	public void retirarDinero(float sacado){
		saldo = saldo - sacado;
	}

}
