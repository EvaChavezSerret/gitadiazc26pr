package tareasUT5;

public class Real {
	private double numero;
	
	public Real(double numero){
		this.numero = numero;
	}
	
	public void suma(Real otro){
		this.numero = this.numero + otro.getNumero();
	}
	
	public static Real suma(Real uno, Real dos){
		Real resultado;
		resultado = new Real(uno.getNumero()+dos.getNumero());
		
		return resultado;
	}
	

	public double getNumero() {
		return numero;
	}
	
	public double setNumero(double numero) {
		return numero;
	}
	
	public static void main(String[] args) {
		
		Real numero1, numero2;
		
		numero1 = new Real(7.0);
		numero2 = new Real(5.0);
		
		numero1.suma(numero2);
		
		System.out.println("Resltado: " + numero1.getNumero());
		
		// Estático
		
		Real suma, numero3, numero4;
		numero3 = new Real(7.0);
		numero4 = new Real(5.0);
		suma = Real.suma(numero3, numero4);
		numero3.suma(numero4);
		// Falta el toString para imprimirlo
		
		System.out.println("Resltado método estático: " + numero1.getNumero());
		

	}

}
