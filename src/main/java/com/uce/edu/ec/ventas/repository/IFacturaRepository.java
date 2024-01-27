package com.uce.edu.ec.ventas.repository;

import java.util.List;

import com.uce.edu.ec.ventas.repository.modelo.Factura;

public interface IFacturaRepository {

	public Factura selecionarPorNumero(String numero);

	public void insertar(Factura factura);

	public List<Factura> seleccionarInnerJoin();
	
	public List<Factura> seleccionarPorRightJoin();
	
	public List<Factura> seleccionarPorLeftJoin();
	
	public List<Factura> seleccionarPorFullJoin();
}
