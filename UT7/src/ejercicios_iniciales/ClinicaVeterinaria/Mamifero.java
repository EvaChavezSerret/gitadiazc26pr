package ejercicios_iniciales.ClinicaVeterinaria;

public class Mamifero extends Animales {

private String raza;

public Mamifero(Cliente due�o, String nombre,double peso,
String fechaNac, String raza) {
super(due�o, nombre, peso, fechaNac);
this.raza=raza;
}

@Override
public String toString() {
return super.toString() + " Mamifero [raza=" + raza + "]";
}


}
