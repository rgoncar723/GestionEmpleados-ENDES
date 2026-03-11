package rgoncar723;

public class Comercial extends Empleado {
	//Atributo
	private double ventas;
	//Constructor
	public Comercial(String dni, String nombre, String apellidos, double sueldoBase) {
		super(dni, nombre, apellidos, sueldoBase);
	}
	//Metodos
	void setVentas(double ventas) {
		this.ventas=ventas;
	}
	@Override
	public double getSueldo() {
		double sueldo=0.0;
		sueldo = getSueldoBase() + (ventas/10); 
		return sueldo;
	}
	
}
