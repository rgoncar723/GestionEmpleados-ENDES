package rgoncar723;

public abstract class Empleado {
	//Atributos
	private String dni;
	private String nombre;
	private String apellidos;
	private double sueldoBase;
	//Constructor
	public Empleado(String dni, String nombre, String apellidos,double sueldoBase) {
		this.dni=dni;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.sueldoBase=sueldoBase;
	}
	//Metodos
	String getDni() {
		return dni;
	}
	String getNombre() {
		return nombre;
	}
	String getApellidos() {
		return apellidos;
	}
	double getSueldoBase() {
		return sueldoBase;
	}
	void setSueldoBase(double sueldoBase) {
		this.sueldoBase=sueldoBase;
	}
	public abstract double getSueldo();
	
	
}
