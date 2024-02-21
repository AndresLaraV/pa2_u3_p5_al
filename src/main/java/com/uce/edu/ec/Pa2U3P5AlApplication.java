package com.uce.edu.ec;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import com.uce.edu.ec.ventas.repository.modelo.Cliente;
import com.uce.edu.ec.ventas.service.IClienteService;

@SpringBootApplication
@EnableAsync
public class Pa2U3P5AlApplication implements CommandLineRunner {
	@Autowired
	private IClienteService clienteService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P5AlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Nombre de Hilo: " + Thread.currentThread().getName());
		long tiempoInicial = System.currentTimeMillis();
		for (int i = 1; i < 10; i++) {
			Cliente cliente = new Cliente();
			cliente.setNombre("CN " + i);
			cliente.setApellido("CA " + i);

			this.clienteService.guardar(cliente);
		}
		long tiempoFinal = System.currentTimeMillis();
		long tiempoTotal = (tiempoFinal - tiempoInicial) / 1000;
		System.out.println("Tiempo transcurrido en segundos " + tiempoTotal);
		// tiempo transcurrido en seg : 9
		//Programacion en paralelo (MultiHilo == MultiThread

//		System.out.println("Nombre de Hilo: " + Thread.currentThread().getName());
//		long tiempoInicial1 = System.currentTimeMillis();
//		List<Cliente> listaCliente = new ArrayList<>();
//		for (int i = 1; i <= 100; i++) {
//			Cliente cliente = new Cliente();
//			cliente.setNombre("CN " + i);
//			cliente.setApellido("CA " + i);
//			listaCliente.add(cliente);
//
//		}
//		listaCliente.stream().forEach(cliente -> this.clienteService.guardar(cliente));
//		long tiempoFinal1 = System.currentTimeMillis();
//		long tiempoTotal1 = (tiempoFinal1 - tiempoInicial1) / 1000;
//		System.out.println("Tiempo transcurrido en segundos " + tiempoTotal);
        //tiempo transcurrido en seg : 100
//		
//		System.out.println("Nombre de Hilo: " + Thread.currentThread().getName());
//		long tiempoInicial = System.currentTimeMillis();
//		List<Cliente> listaCliente = new ArrayList<>();
//		for (int i = 1; i <= 10; i++) {
//			Cliente cliente = new Cliente();
//			cliente.setNombre("CN " + i);
//			cliente.setApellido("CA " + i);
//			listaCliente.add(cliente);
//
//		}
//		listaCliente.parallelStream().forEach(cliente -> this.clienteService.guardar(cliente));
//		long tiempoFinal = System.currentTimeMillis();
//		long tiempoTotal = (tiempoFinal - tiempoInicial) / 1000;
//		System.out.println("Tiempo transcurrido en segundos " + tiempoTotal);
//		// tiempo transcurrido en seg : 14
	}

}
