package prueba;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dime tu nombre: ");
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		System.out.println("Hola, " + nombre);
		sc.close();
	}

}
