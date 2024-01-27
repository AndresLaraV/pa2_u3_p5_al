package com.uce.edu.ec.ventas.service;

import java.util.List;

import com.uce.edu.ec.ventas.repository.modelo.Factura;

public interface IFacturaService {

	public Factura buscarPorNumero(String numero);

	public void guardar (Factura factura);
	
	public List<Factura> buscarInnerJoin();
	
	public List<Factura> buscarPorRightJoin();
	
	public List<Factura> buscarPorLeftJoin();
	
	public List<Factura> buscarPorFullJoin();
}
