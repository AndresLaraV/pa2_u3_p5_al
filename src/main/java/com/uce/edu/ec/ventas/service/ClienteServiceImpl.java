package com.uce.edu.ec.ventas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.ec.ventas.repository.IClienteRepository;
import com.uce.edu.ec.ventas.repository.modelo.Cliente;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class ClienteServiceImpl implements IClienteService {
	@Autowired
	private IClienteRepository ClienteRepository;

	@Transactional(value = TxType.REQUIRED)
	@Override
	public void guardar(Cliente cliente) {
		// TODO Auto-generated method stub
		try {
			this.ClienteRepository.insertar(cliente);
		} catch (RuntimeException e){
			System.out.println("ERROR");
		}
		
	}

}
