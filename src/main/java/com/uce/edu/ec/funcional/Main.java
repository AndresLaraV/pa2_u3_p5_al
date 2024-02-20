package com.uce.edu.ec.funcional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Supplier
		// Clases
		System.out.println("----------SUPPLIER----------");
		System.out.println("CLASES");
		IPersonaSupplier<String> supplierClase = new PersonaSupplierImpl();
		System.out.println(supplierClase.getId());

		// Lambdas
		System.out.println("LAMBDA");
		IPersonaSupplier<String> supplierLambda = () -> {
			String cedula = "12345";
			cedula = cedula + " pais";
			return cedula;
		};
		System.out.println(supplierLambda.getId());
		// Lambda2
		System.out.println("LAMBDA 2");
		IPersonaSupplier<String> supplierLambda2 = () -> "12345 " + "canton";
		System.out.println(supplierLambda2.getId());

		System.out.println("LAMBDA 3");
		IPersonaSupplier<Integer> supplierLambda3 = () -> {
			Integer valor1 = Integer.valueOf(100);
			valor1 = valor1 * Integer.valueOf(50) / Integer.valueOf(5);
			return valor1;
		};
		System.out.println(supplierLambda3.getId());

		// Metodos Referenciados
		System.out.println("Metodos Referenciados ");
		MetodosReferenciados metR = new MetodosReferenciados();
		IPersonaSupplier<String> supplierLambda4 = metR::obtenerId;
		System.out.println(supplierLambda4.getId());

		// CONSUMER
		System.out.println("----------CONSUMER----------");
		System.out.println("CLASE");
		IPersonaConsumer<String> consumerClase = new PersonaConsumerImpl();
		consumerClase.accept("Profesor");

		// Lambdas
		System.out.println("LAMBDA");
		IPersonaConsumer<String> consumerLambda = (cadena) -> {
			System.out.println("Se inserta");
			System.out.println(cadena);
		};
		consumerLambda.accept("Profesor");

		// Metodos Referenciados
		System.out.println("Metodos Referenciados ");
		IPersonaConsumer<String> consumer2 = metR::procesar;
		consumer2.accept("Método ref");

		// PREDICATE
		System.out.println("----------PREDICATE----------");
		// Lambdas
		System.out.println("LAMBDAS");
		IPersonaPredicate<Integer> predicateLambda = numero -> numero.compareTo(7) == 0;
		System.out.println(predicateLambda.evaluar(Integer.valueOf(7)));

		IPersonaPredicate<String> predicateLambda1 = letra -> "ANDRES".contains(letra);
		System.out.println(predicateLambda1.evaluar("K"));

		// Metodos Referenciados
		System.out.println("Metodos Referenciados ");
		IPersonaPredicate<String> predicate = metR::evaluar;
		System.out.println(predicate.evaluar("Z"));

		IPersonaPredicate<Integer> predicate1 = metR::comparar;
		System.out.println(predicate1.evaluar(8));

		// FUNCTION
		System.out.println("----------FUNCTION----------");
		// Lambdas
		System.out.println("LAMBDAS");
		IPersonaFunction<String, Integer> functionLambda = numero -> {
			numero = numero + Integer.valueOf(100);
			String numeroString = numero.toString().concat("-Valor");
			return numeroString;
		};
		System.out.println(functionLambda.aplicar(7));

		IPersonaFunction<Empleado, Ciudadano> functionLambda1 = ciudadano -> {
			Empleado empl = new Empleado();
			empl.setNombreCompleto(ciudadano.getNombre() + " " + ciudadano.getApellido());
			if (ciudadano.getProvincia().compareTo("Pichincha") == 0) {
				empl.setPais(" Ecuador");
			}
			return empl;
		};
		Ciudadano ciud = new Ciudadano();
		ciud.setApellido("Lara");
		ciud.setNombre("Andres");
		ciud.setProvincia("Pichincha");

		Empleado emple = functionLambda1.aplicar(ciud);
		System.out.println(emple);

		// Metodos Referenciados
		System.out.println("Metodos Referenciados ");
		Empleado empl2 = new Empleado();
		empl2.setNombreCompleto("Cecilia Viana");
		empl2.setPais("Ecuador");

		IPersonaFunction<Ciudadano, Empleado> function = metR::cambiar;
		Ciudadano ciud2 = function.aplicar(empl2);
		System.out.println(ciud2);

		// UNARY OPERATOR
		System.out.println("----------UNARY OPERATOR----------");
		// Lambdas
		System.out.println("LAMBDAS");
		IPersonaUnaryOperator<Integer> unaryOperatorLambda = numero -> numero + (numero * 2);
		System.out.println(unaryOperatorLambda.aplicar(15));

		IPersonaUnaryOperator<Integer> unaryOperatorLambda2 = numero -> numero + (numero * 2);
		System.out.println(unaryOperatorLambda2.aplicar(10));

		// Metodos Referenciados
		System.out.println("Metodos Referenciados ");
		IPersonaUnaryOperator<Empleado> unary = metR::procesar;
		Empleado empl3 = unary.aplicar(empl2);
		System.out.println(empl3);

		System.out.println(
				"----------IMPLEMENTACION DE INTERFACES FUNCIONALES MEDIANTE LIBRERIAS JAVA--------------------");
		System.out.println("----------SUPPLIER JAVA----------");
		Stream<String> lista = Stream.generate(() -> "12345 " + "canton").limit(5);
		lista.forEach(cadena -> System.out.println(cadena));

		System.out.println("----------CONSUMER JAVA----------");
		List<Integer> listaNumeros = Arrays.asList(1, 21, 3, 43, 5, 69, 7, 8, 9);
		listaNumeros.forEach(numero -> {
			System.out.println("Se Insertó");
			System.out.println(numero);
		});
		System.out.println("----------PREDICATE JAVA----------");
		Stream<Integer> listaFiltrada = listaNumeros.stream().filter(numero -> {
			return numero >= 10;
		});
		listaFiltrada.forEach(numero -> System.out.println(numero));

		System.out.println("----------FUNCTION JAVA----------");
		Stream<String> listaCambiada = listaNumeros.stream().map(numero -> {
			numero = numero * 100 / 20;
			return "Num: " + numero.toString();
		});
		listaCambiada.forEach(cadena -> System.out.println(cadena));

		Ciudadano ciud3 = new Ciudadano();
		ciud3.setApellido("Viana");
		ciud3.setNombre("Sebastian");
		ciud3.setProvincia("Pichincha");

		Ciudadano ciud4 = new Ciudadano();
		ciud4.setApellido("Muñoz");
		ciud4.setNombre("Kathy");
		ciud4.setProvincia("Pichincha");

		Ciudadano ciud5 = new Ciudadano();
		ciud5.setApellido("Paredes");
		ciud5.setNombre("Armando");
		ciud5.setProvincia("Tulcan");

		List<Ciudadano> listaCiudadano = Arrays.asList(ciud3, ciud4, ciud5);
		Stream<Empleado> listaEmpleados = listaCiudadano.stream().map(ciudadano01 -> {
			Empleado empl01 = new Empleado();
			empl01.setNombreCompleto(ciudadano01.getNombre() + " " + ciudadano01.getApellido());
			if (ciudadano01.getProvincia().compareTo("Pichincha") == 0) {
				empl01.setPais(" Ecuador");
			} else {
				empl01.setPais(" España");
			}
			return empl01;
		});
		listaEmpleados.forEach(empleado -> System.out.println(empleado));
		
		System.out.println("----------UNARY OPERATOR JAVA----------");
		Stream<String> listaNumeros2 = listaNumeros.stream().map(numero -> {
			numero = numero * 100 / 20;
			return "Num: " + numero.toString();
		});
		listaNumeros2.forEach(numero -> System.out.println(numero));
		
	}

}
