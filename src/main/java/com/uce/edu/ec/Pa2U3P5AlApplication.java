package com.uce.edu.ec;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import com.uce.edu.ec.ventas.repository.modelo.Cliente;
import com.uce.edu.ec.ventas.repository.modelo.Factura;
import com.uce.edu.ec.ventas.service.IFacturaService;

@SpringBootApplication
public class Pa2U3P5AlApplication implements CommandLineRunner {
	@Autowired
	private IFacturaService facturaService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P5AlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println(TransactionSynchronizationManager.isActualTransactionActive());
		
		Factura  fact1 = new Factura();
		fact1.setCedula("125125");
		fact1.setFecha(LocalDate.now());
		fact1.setNumero("001-001004");
		
		Cliente clie1 = new Cliente ();
		clie1.setApellido(null);
		clie1.setNombre("Sebastian");
		
		//this.facturaService.guardar(fact1, clie1);

		System.out.println(TransactionSynchronizationManager.isActualTransactionActive());
		this.facturaService.prueba();	
		
	}

}
