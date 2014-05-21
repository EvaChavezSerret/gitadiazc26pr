package tema11;

public class UsoDeExcepciones {

	public static void main(String[] args) {

		try{
			lanzaExcepcion();//llama al método lanzaExcepcion
		}//fin de try
		catch(Exception excepcion){//excepcion lanzada por lanzaExcepcion
			System.err.println("La excepción se manejo en main");
		}//fin del catch
		
		noLanzaExcepcion();
	}//fin del main

	//demuestra los bloques try...catch...finally
	public static void lanzaExcepcion()throws Exception{
		try{//lanza una excepcion y la atrapa de inmediato
			System.out.println("Metodo lanzaExcepcion");
			throw new Exception(); //genera la excepcion
		}//fin de try
		catch(Exception excepcion){//atrapa la excepcion lanzada en el bloque try
			System.err.println("La excepción se manejo en el método lanzaExcepción");//vuelve a lanzar para procesarla mas adelante
			
			//no se llegaría al código que se coloque aquí, se producirían errores de compilación
			
		}//fin del catch
		finally{//se ejecuta sin importar lo que ocurra en los bloques try...catch
			System.err.println("Se ejecuto finally en lanzaExcepcion");
		}//fin del finally
		
		//no se llegaria al codigo que se coloque aqui; se producirian errores de compilacion
	}//fin del método lanzaExcepcion
	
	public static void noLanzaExcepcion(){
		try{//el bloque try no lanza una excepcion
			System.out.println("Metodo noLanzaExcepcion");
		}//fin de try
		catch(Exception excepcion){//no se ejecuta
			System.err.println(excepcion);
		}//fin del catch
		finally{//se ejecuta sin importar lo que ocurra en los bloques try...catch
			System.err.println("Se ejecuto finally en noLanzaExcepcion");
		}//fin del finally
		System.out.println("Fin del metodo noLanzaExcepcion");
	}//fin del método noLanzaExcepcion
	
}//fin de la clase UsoDeExcepciones
