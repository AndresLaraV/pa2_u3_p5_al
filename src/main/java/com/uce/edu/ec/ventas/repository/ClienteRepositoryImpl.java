package com.uce.edu.ec.ventas.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.ec.ventas.repository.modelo.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class ClienteRepositoryImpl implements IClienteRepository {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional(value = TxType.REQUIRES_NEW)//T1
	@Override
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		System.out.println("ANTES");
		this.entityManager.persist(cliente);
		System.out.println("DESPUES");
	}

}
