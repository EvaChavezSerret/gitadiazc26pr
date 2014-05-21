package Preparacion2EV;
/*
 * crear un metodo llamado comprobarCuenta al que pasemos una cadena que contiene un numero de cuenta con el formato:
 * "entidad oficina dc cuenta"
 * "2077-0024-00-3102575766" y devuelve true o false si el numero de control es correcto o no.
 * 
 * La forma de calcular el dígito de control es esta:

La primera cifra del oficina se multiplica por 4.
La segunda cifra del oficina se multiplica por 8.
La tercera cifra del oficina se multiplica por 5.
La cuarta cifra del oficina se multiplica por 10.

La primera cifra de la entidad se multiplica por 9.
La segunda cifra de la entidad se multiplica por 7.
La tercera cifra de la entidad se multiplica por 3.
La cuarta cifra de la entidad se multiplica por 6.

Se suman todos los resultados obtenidos.
Se divide entre 11 y nos quedamos con el resto de la división.
A 11 le quitamos el resto anterior, y ese el el primer dígito de control, con la salvedad de que si nos da 10, el dígito es 1

Para obtener el segundo dígito de control:
La primera cifra de la cuenta se multiplica por 1
La primera cifra de la cuenta se multiplica por 2
La primera cifra de la cuenta se multiplica por 4
La primera cifra de la cuenta se multiplica por 8
La primera cifra de la cuenta se multiplica por 5
La primera cifra de la cuenta se multiplica por 10
La primera cifra de la cuenta se multiplica por 9
La primera cifra de la cuenta se multiplica por 7
La primera cifra de la cuenta se multiplica por 3
La primera cifra de la cuenta se multiplica por 6
Se suman todos los resultados obtenidos.
Se divide entre 11 y nos quedamos con el resto de la división.
A 11 le quitamos el resto anterior, y ese el el segundo dígito de control, con la salvedad de que si nos da 10, el dígito es 1
 */
public class UnoDani {

	public static boolean comprobarCuenta(String cuenta){
		String dc0 = cuenta.substring(10,12);
		int dc=Integer.parseInt(dc0);		
		
		//primer digito
		double suma=0;
		int dc1=0;		
		
		//oficina
		suma+=Integer.parseInt(cuenta.substring(5,6))*9;
		suma+=Integer.parseInt(cuenta.substring(6,7))*7;
		suma+=Integer.parseInt(cuenta.substring(7,8))*3;
		suma+=Integer.parseInt(cuenta.substring(8,9))*6;
		//entidad
		suma+=Integer.parseInt(cuenta.substring(0,1))*4;
		suma+=Integer.parseInt(cuenta.substring(1,2))*8;
		suma+=Integer.parseInt(cuenta.substring(2,3))*5;
		suma+=Integer.parseInt(cuenta.substring(3,4))*10;
		
		suma=suma%11;
		dc1=(int)(11-suma);
		if(dc1==10){
			dc1=1;
		}else if(dc1==11){
			dc1=0;
		}
		
		//segundo digito
		suma=0;
		int dc2=0;
		//cuenta
		suma+=Integer.parseInt(cuenta.substring(13,14))*1;
		suma+=Integer.parseInt(cuenta.substring(14,15))*2;
		suma+=Integer.parseInt(cuenta.substring(15,16))*4;
		suma+=Integer.parseInt(cuenta.substring(16,17))*8;
		suma+=Integer.parseInt(cuenta.substring(17,18))*5;
		suma+=Integer.parseInt(cuenta.substring(18,19))*10;
		suma+=Integer.parseInt(cuenta.substring(19,20))*9;
		suma+=Integer.parseInt(cuenta.substring(20,21))*7;
		suma+=Integer.parseInt(cuenta.substring(21,22))*3;
		suma+=Integer.parseInt(cuenta.substring(22,23))*6;
		
		suma=suma%11;
		dc2=(int)(11-suma);
		if(dc2==10){
			dc2=1;
		}else if(dc2==11){
			dc2=0;
		}
		
		String DC=""+dc1+dc2;
		int calculoDC=Integer.parseInt(DC);
		
		if(calculoDC!=dc){
			return false;
		}else{
			return true;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		String cuenta="1234-5678-06-1234567890";
		System.out.println("Número de cuenta: "+cuenta);
		if(comprobarCuenta(cuenta)){
			System.out.println("EL DIGITO DE CONTROL ES CORRECTO.");
		}else{
			System.out.println("EL DIGITO DE CONTROL ES INCORRECTO.");
		}
		
		
		String cuenta2="1234-5678-42-1234567890";
		System.out.println("Número de cuenta: "+cuenta2);
		if(comprobarCuenta(cuenta2)){
			System.out.println("EL DIGITO DE CONTROL ES CORRECTO.");
		}else{
			System.out.println("EL DIGITO DE CONTROL ES INCORRECTO.");
		}

	}

}