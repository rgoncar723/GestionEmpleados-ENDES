package rgoncar723;

import java.util.*;

public class Plantilla {
	private List<Empleado> listaEmpleados = new ArrayList<>();

	public void contratarEmpleado(Empleado empleado) {
		listaEmpleados.add(empleado); //añade el empleado a lista 
	}

	public List<Empleado> getEmpleadosPorNombre(String filtroNombre) {
		List<Empleado> filtrados = new ArrayList<>();
		String noFiltros = filtroNombre.toLowerCase();
		if (filtroNombre == null || filtroNombre.isEmpty()) {
			return new ArrayList<>(listaEmpleados);
		}

		for (Empleado e : listaEmpleados) {
			if (e.getNombre().toLowerCase().contains(noFiltros) // Obtiene el nombre, lo pasa a minusculas y lo compara
																// con noFiltro para comprobar si son iguales.
					|| (e.getApellidos().toLowerCase().contains(noFiltros))) {
				filtrados.add(e);
			}
		}
		return filtrados;

	}
}
