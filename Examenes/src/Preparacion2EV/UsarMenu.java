package Preparacion2EV;

public class UsarMenu {
	
	public static void verMenu(){
		Menu menu = new Menu();

		menu.añadirOpcion("Opcion 1");
		menu.añadirOpcion("Opcion 2");
		menu.añadirOpcion("Opcion 3");
		menu.añadirOpcion("Opcion 4");
		menu.añadirSalir("Salir");

		while (menu.obtenerOpcionElegidaUsuario() != 0) {

			System.out.println("Se ha introducido la opción: "
					+ menu.getOpcion());
			
			int opcion;
			opcion = menu.getOpcion();
			
			switch (opcion) {
			case 1:
				metodo1();
				System.out.println("");
				break;
			case 2:
				metodo2();
				System.out.println("");
				break;
			case 3:
				metodo3();
				System.out.println("");
				break;
			case 4:
				metodo4();
				System.out.println("");
				break;

			default:
				break;
			}
		}
		
	}
	
	private static void metodo4() {
		System.out.println("Método 4");
		
	}

	private static void metodo3() {
		System.out.println("Método 3");
		
	}

	private static void metodo2() {
		System.out.println("Método 2");
		
	}

	private static void metodo1() {
		System.out.println("Método 1");
		
	}
	
	public static void main(String[] args) {
		
		verMenu();
	}

}
