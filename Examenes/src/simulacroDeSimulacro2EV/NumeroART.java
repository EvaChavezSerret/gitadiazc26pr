package simulacroDeSimulacro2EV;

public class NumeroART {
	
	private int dado = 0;
	private int atendido = 0;
	
	public int darNumero(){
		dado++;
		return dado;
	}
	
	public int atender(){
		atendido++;
		return atendido;
	}
	
	public void mostrarCola(){
		System.out.println("Clientes sin atender: " + (dado-atendido));
		while(dado>atendido){
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		NumeroART charcuteria = new NumeroART();
		System.out.println(charcuteria.darNumero());
		
		
		

	}

}
