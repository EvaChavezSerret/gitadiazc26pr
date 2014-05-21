package ejemplos_UT5;

public class CuentaV2 {

	private long num_cuenta=265145875;
	
	public double getnum_Cuenta() {
		return num_cuenta;
	}

	private double saldo=2000;
	private long num_transacciones=0;

	public void ingresar(double cantidad) {
		saldo+=cantidad;
		num_transacciones++;
	}

	public void sacar(double cantidad) {
		saldo-=cantidad;
		if (saldo<0){
			System.out.println("¡No puedes sacar tanto dinero!");
			saldo+=cantidad;
		}else{
			System.out.println("Te queda en la cuenta " + saldo);
			num_transacciones++;
		}	
	}

	public double getSaldo() {
		return saldo;
	}

	public long getTransacciones() {
		return num_transacciones;
	}
}