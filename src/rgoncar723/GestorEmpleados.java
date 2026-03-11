package rgoncar723;

import java.util.*;

public class GestorEmpleados {
	// Atributos
	private Plantilla plantilla;
	private IEntradaSalida consola;

	// Constructor
	public GestorEmpleados(Plantilla plantilla, IEntradaSalida consola) {
		this.plantilla = plantilla;
		this.consola = consola;
	}

	// Metodos
	void ejecutar() {
		int opcion = 0;

		do {
			consola.mostrarMenu();
			opcion = consola.leerEntero("Opcion:  ");
			switch (opcion) {
			case 1 -> contratarEmpleado();
			case 2 -> listarTodos();
			case 3 -> listarPorFiltro();
			case 4 -> consola.imprimir("Saliendo...");
			}
		} while (opcion != 4);
	}

	void contratarEmpleado() {
		int opcion = -1;
		String nombre;
		String apellidos;
		String dni;
		int categoria;
		int ventas;
		double sueldoBase;
		Comercial comercial;
		consola.imprimir("Rellene los siguientes campos");
		nombre = consola.leerTexto("Nombre:  ");
		apellidos = consola.leerTexto("Apellidos: ");
		dni = consola.leerTexto("DNI:  ");
		sueldoBase = consola.leerImporte("Sueldo Base:  ");
		consola.imprimir("¿Qué tipo de empleado desea contratar?");
		consola.imprimir("1- Tecnico 2- Comercial");
		opcion = consola.leerEntero("Opcion:  ");
		if (opcion == 1) {
			categoria = consola.leerEntero("Categoría del empleado:  ");
			plantilla.contratarEmpleado(new Tecnico(dni, nombre, apellidos, sueldoBase, categoria));
		}
		if (opcion == 2) {
			ventas = consola.leerEntero("Ventas:  ");
			plantilla.contratarEmpleado(comercial = new Comercial(dni, nombre, apellidos, sueldoBase));
			comercial.setVentas(ventas);
			
		}

	}

	void ordenarPorNombre(List<Empleado> empleados) {

		Collections.sort(empleados, Comparator.comparing(Empleado::getNombre));
	}

	void listarTodos() {
		listarEmpleados(plantilla.getEmpleadosPorNombre(""));
	}

	void listarPorFiltro() {
		String mensaje;
		mensaje = consola.leerTexto("Texto a buscar:  ");
		listarEmpleados(plantilla.getEmpleadosPorNombre(mensaje));
	}

	void listarEmpleados(List<Empleado> empleados) {
		Empleado e;
		ordenarPorNombre(empleados);
		for (int i = 0; i < empleados.size(); i++) {
			e = empleados.get(i);
			consola.imprimir( (i+1) + "- " + e.getNombre()+ " " + e.getApellidos() + ": " +e.getSueldo() + "€");
		}

	}

}
