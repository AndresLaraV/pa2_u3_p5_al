package com.uce.edu.ec.ventas.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.ec.ventas.repository.modelo.Factura;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class FacturaRepositoryImpl implements IFacturaRepository {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Factura selecionarPorNumero(String numero) {
		// TODO Auto-generated method stub
		TypedQuery<Factura> myQuery = this.entityManager.createQuery("Select f From Factura f Where f.numero = :numero",
				Factura.class);
		myQuery.setParameter("numero", numero);
		Factura fact = myQuery.getSingleResult();
		fact.getDetalleFacturas().size();
		return fact;

	}

	@Override
	public void insertar(Factura factura) {
		// TODO Auto-generated method stub
		this.entityManager.persist(factura);
	}
}
