package com.uce.edu.ec.ventas.service;

import java.time.LocalDate;
import java.util.List;

import com.uce.edu.ec.ventas.repository.modelo.Factura;
import com.uce.edu.ec.ventas.repository.modelo.dto.FacturaDTO;

public interface IFacturaService {

	public Factura buscarPorNumero(String numero);

	public void guardar(Factura factura);

	public void actualizar(Factura factura);

	public int actualizarFechas(LocalDate fechaNueva, LocalDate fechaActual);

	public void borrar(Integer id);

	public int borrarPorNumero(String numero);

	public List<Factura> buscarInnerJoin();

	public List<Factura> buscarPorRightJoin();

	public List<Factura> buscarPorLeftJoin();

	public List<Factura> buscarPorFullJoin();

	public List<Factura> buscarPorWhereJoin();

	public List<Factura> buscarPorFetchJoin();
	
	public List<FacturaDTO> buscarFacturasDTO();
}
