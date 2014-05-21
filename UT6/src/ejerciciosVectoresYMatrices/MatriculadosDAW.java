package ejerciciosVectoresYMatrices;

/*
 * Queremos guardar en la memoria del ordenador el número de alumnos matriculados (por módulos) 
 * en el ciclo de DAW. Sabemos que los alumnos matriculados por cada módulo son:

21 alumnos matriculados en Sistemas Informáticos.
17 alumnos matriculados en Base de Datos.
30 alumnos matriculados en Programación.
14 alumnos matriculados en Lengaje de Marcas.
12 alumnos matriculados en Entornos de Desarrollo.
25 alumnos matriculados en Acceso a Datos.
 */

public class MatriculadosDAW {

	public static void main(String[] args) {

		String [] matriculados = {"Sistemas Informáticos","Base de Datos","Programación",
				"Lenguaje de Marcas", "Entornos de Desarrollo", "Acceso de Datos"};
		int [] numAlumnos = {21,17,30,14,12,25};
		
		System.out.println("Alumnos matriculados: ");
		for(int j=0;j<matriculados.length;j++){
			System.out.println("Para el módulo " + "'" +  matriculados[j] + "'" +  " hay " + numAlumnos[j] + " alumnos.");
		}

	}

}
