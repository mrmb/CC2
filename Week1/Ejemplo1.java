import java.util.*;

public class Ejemplo1{
	
	// Campos
	// Constructores
	// Metodos
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese nombre");
		String nombre = sc.nextLine();
		System.out.println("Ingrese apellido");
		String apellido = sc.nextLine();
		String user = "";
		int primeraOcurrenciaEspacio = apellido.indexOf(" ");
		System.out.println(primeraOcurrenciaEspacio);
		user = nombre.substring(0,1) + apellido.substring(0,primeraOcurrenciaEspacio);
		System.out.println("El user es : " + user);


	}

}