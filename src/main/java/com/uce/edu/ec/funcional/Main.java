package com.uce.edu.ec.funcional;

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
		System.out.println("LAMBDA2");
		IPersonaSupplier<String> supplierLambda2 = () -> "12345 " + "canton";
		System.out.println(supplierLambda2.getId());

		System.out.println("LAMBDA3");
		IPersonaSupplier<Integer> supplierLambda3 = () -> {
			Integer valor1 = Integer.valueOf(100);
			valor1 = valor1 * Integer.valueOf(50) / Integer.valueOf(5);
			return valor1;
		};
		System.out.println(supplierLambda3.getId());

		// Metodos Referenciados

		// CONSUMER
		System.out.println("----------CONSUMER----------");
		System.out.println("CLASE");
		IPersonaConsumer<String> consumerClase = new PersonaConsumerImpl();
		consumerClase.accept("Profesor");
		
		//Lambdas
		System.out.println("LAMBDA");
		IPersonaConsumer<String> consumerLambda = (cadena) -> {
			System.out.println("Se inserta");
			System.out.println(cadena);
		};
		consumerLambda.accept("Profesor");
		
		// PREDICATE
		System.out.println("----------PREDICATE----------");
		//Lambdas
		System.out.println("LAMBDAS");
		IPersonaPredicate<Integer> predicateLambda = numero -> numero.compareTo (7)== 0;
		System.out.println(predicateLambda.evaluar(Integer.valueOf(7)));
		
		IPersonaPredicate<String> predicateLambda1 = letra -> "ANDRES".contains(letra);
		System.out.println(predicateLambda1.evaluar("K"));
		
	}

}
