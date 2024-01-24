package com.uce.edu.ec.ventas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.ec.ventas.repository.IFacturaRepository;
import com.uce.edu.ec.ventas.repository.modelo.Factura;

@Service
public class FacturaServiceImpl implements IFacturaService {
	@Autowired
	IFacturaRepository FacturaRepository;

	@Override
	public Factura buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.FacturaRepository.selecionarPorNumero(numero);
	}

	@Override
	public void guardar(Factura factura) {
		// TODO Auto-generated method stub
		this.FacturaRepository.insertar(factura);
	}

}
