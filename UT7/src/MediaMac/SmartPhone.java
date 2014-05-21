package MediaMac;

import java.util.Arrays;
import java.util.Scanner;


public class SmartPhone extends Aparato {

// Debe tener adem�s como atributo la tecnología de transmisión soportada,
// que será una
// lista de cadenas, como por ejemplo [GPRS,EDGE,HSDPA].

private String[] tecTransm;
private int numTecnologias;

public SmartPhone(String numProducto, String numSerie, String nombre,
String so, double precioBase, int numTecnologias) {
super(numProducto, numSerie, nombre, so, precioBase);
this.tecTransm = new String [10];
this.numTecnologias=0;
}
public String[] getTecTransm() {
return Arrays.copyOf(tecTransm, numTecnologias);
}
/*
public void setTecTransm(String nueTec) {
if (numTecnologias<10)
tecTransm[numTecnologias++]=nueTec;
}
*/	

public void setTecTransm(String[] tecTransm) {
for(int i=0;i<tecTransm.length;i++)
this.tecTransm[i] = new String(tecTransm[i]);
this.numTecnologias=tecTransm.length;
}

@Override
public String toString() {
StringBuilder sb=new StringBuilder();

for(int i=0;i<numTecnologias;i++) {
sb.append(tecTransm[i]);
if (i<numTecnologias-1) sb.append(", ");
}

return super.toString() + "\nSubClase: SmartPhone\n\tTecnologías-->"
+ sb;
}

// Añadir el metodo addTecnologia en la clase SmartPhone que tome como
// para�metro una cadena
// con el nombre de una tecnologia inalambrica y lo incluya en la lista de
// tecnologias soportada.
// Debe ser independiente de mayuscular/minusculas y controlar que la misma
// tecnologia no se repita.
private boolean repetida(String tecnologia) {
boolean repetida = false;
for(int i=0; i < this.numTecnologias && !repetida; ++i) {
if(this.tecTransm[i].equalsIgnoreCase(tecnologia)) {
repetida = true;
}	
}

return repetida;	
}
public void addTecnologia(String tecnologia){

if(!this.repetida(tecnologia)) {
this.tecTransm[this.numTecnologias] = tecnologia.toUpperCase();
++this.numTecnologias;
} else
System.out.println("La tecnología ya está definida.");
}



}