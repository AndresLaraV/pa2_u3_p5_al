package com.uce.edu.ec.funcional;

public class MetodosReferenciados {
	// Supplier
	public String obtenerId() {
		// TODO Auto-generated method stub

		String cedula = "12345";
		cedula = cedula + " Referenciado";
		return cedula;
	}

	// Consumer
	public void procesar(String cadena) {
		// TODO Auto-generated method stub
		// System.out.println("Se inserta");
		System.out.println(cadena);
		System.out.println("Se procesó la cadena");
	}

	// Predicate
	public boolean evaluar(String cadena) {
		return "Andres ".contains(cadena);
	}

	public boolean comparar(Integer numero) {
		return 8 == numero;
	}

	// Function
	public Ciudadano cambiar(Empleado empl) {
		Ciudadano ciud = new Ciudadano();
		String nombre = empl.getNombreCompleto().split(" ")[0];
		String apellido = empl.getNombreCompleto().split(" ")[1];
		ciud.setNombre(nombre);
		ciud.setApellido(apellido);
		ciud.setProvincia("Tulcan");
		return ciud;
	}

	// UNARY OPERATOR
	public Empleado procesar(Empleado empl) {
		empl.setNombreCompleto(empl.getNombreCompleto() + " " + empl.getPais());
		empl.setPais(empl.getPais() + " de nacimiento");
		return empl;
	}
}
