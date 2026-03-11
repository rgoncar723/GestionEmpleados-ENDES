package rgoncar723;

public class Main {

	public static void main(String[] args) {
		Consola consola = new Consola();
		Plantilla plantilla = new Plantilla();
		GestorEmpleados GEmpleados = new GestorEmpleados(plantilla,consola);
		
		GEmpleados.ejecutar();
		

	}

}
