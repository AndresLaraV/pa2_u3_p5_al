package com.uce.edu.ec.ventas.repository;

import com.uce.edu.ec.ventas.repository.modelo.Factura;

public interface IFacturaRepository {

	public Factura selecionarPorNumero(String numero);

	public void insertar(Factura factura);
}
