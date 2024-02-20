package com.uce.edu.ec.ventas.service;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import com.uce.edu.ec.ventas.repository.IClienteRepository;
import com.uce.edu.ec.ventas.repository.modelo.Cliente;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class ClienteServiceImpl implements IClienteService {
	@Autowired
	private IClienteRepository ClienteRepository;

	@Transactional(value = TxType.REQUIRES_NEW) //T2
	@Override
	//begin
	public void guardar(Cliente cliente) {
		// TODO Auto-generated method stub
		System.out.println("Nombre de Hilo: " + Thread.currentThread().getName());
		try {
			this.ClienteRepository.insertar(cliente);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (RuntimeException e) {
			System.out.println("ERROR");
		}
	}//commit

	@Override
	@Transactional(value = TxType.SUPPORTS)
	public void pruebaSupports() {
		// TODO Auto-generated method stub
		System.out.println("Este es un método Supports");
		System.out.println("Prueba Supports Cliente "+TransactionSynchronizationManager.isActualTransactionActive());
	}

	@Override
	@Transactional(value = TxType.NEVER)
	public void pruebaNever() {
		// TODO Auto-generated method stub
		System.out.println("Este es un método Never");
		System.out.println("Prueba Never Cliente "+TransactionSynchronizationManager.isActualTransactionActive());
	}
}
