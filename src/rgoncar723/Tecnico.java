package rgoncar723;

public class Tecnico extends Empleado {
	//Atributo
	private int categoria;
	//Constructor
	public Tecnico(String dni, String nombre, String apellidos, double sueldoBase, int categoria) {
		super(dni, nombre, apellidos, sueldoBase);
		this.categoria=categoria;
		
	}
	//Metodo 
	@Override
	public double getSueldo() {
		double sueldo = 0.0;
		sueldo = getSueldoBase()+(categoria*100); 
		return sueldo;
	}

}
