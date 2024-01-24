package com.uce.edu.ec.ventas.service;

import com.uce.edu.ec.ventas.repository.modelo.Factura;

public interface IFacturaService {

	public Factura buscarPorNumero(String numero);

	public void guardar (Factura factura);
}
