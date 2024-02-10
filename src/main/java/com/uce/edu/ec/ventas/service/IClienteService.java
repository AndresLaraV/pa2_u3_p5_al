package com.uce.edu.ec.ventas.service;

import com.uce.edu.ec.ventas.repository.modelo.Cliente;

public interface IClienteService {
	public void guardar (Cliente cliente);
	
	public void pruebaSupports();
	
	public void pruebaNever();
}
