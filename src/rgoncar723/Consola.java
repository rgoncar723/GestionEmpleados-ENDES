package rgoncar723;

import java.util.Scanner;

public class Consola implements IEntradaSalida {
	//Atributo
	private Scanner sc;
	
	
	//Constructor
	public Consola() {
		this.sc = new Scanner(System.in);
	}
	@Override
	public void imprimir(String texto) {
		System.out.println(texto);
		
	}

	@Override
	public void imprimirLinea(String texto) {
		System.out.print(texto);
		
	}

	@Override
	public String leerTexto(String mensaje) {
		imprimir(mensaje);
		mensaje = sc.nextLine();
		return mensaje.trim();
	}

	@Override
	public int leerEntero(String mensaje) {
		boolean error = false;
		int numero = 0;
		do {
			error = false;
			String texto = leerTexto(mensaje);
			try {
				numero = Integer.parseInt(texto);
			} catch (NumberFormatException e) {
				imprimirLinea("Error: Introduce un número entero válido.");
				error = true;
			}

		} while (error);
		return numero;
	}

	@Override
	public double leerImporte(String mensaje) {
		boolean error = false;
		double numero = 0.0;
		do {
			error = false;
			String texto = leerTexto(mensaje);
			try {
				numero = Double.parseDouble(texto);
			} catch (NumberFormatException e) {
				imprimirLinea("Error: Introduce un número válido.");
				error = true;
			}

		} while (error);
		return numero;
	}

	@Override
	public void mostrarMenu() {
		imprimir("====Menu====");
		imprimir("1. Contratar a un empleado");
		imprimir("2. Listar todos los empleados");
		imprimir("3. Listar empleados con filtros");
		imprimir("4. Salir del programa");
		imprimir("============");
		
	}

	@Override
	public void limpiarPantalla() {
		for(int i=0; i<=50;i++) {
			imprimir(" ");
		}	
	}

	@Override
	public void pausa() {
		imprimir("Pulse una tecla para continuar...");
		sc.nextLine();
		
	}

}
