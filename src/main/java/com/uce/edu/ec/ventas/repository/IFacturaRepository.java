package com.uce.edu.ec.ventas.repository;

import java.time.LocalDate;
import java.util.List;

import com.uce.edu.ec.ventas.repository.modelo.Factura;
import com.uce.edu.ec.ventas.repository.modelo.dto.FacturaDTO;

public interface IFacturaRepository {
	public Factura buscar ();
	
	public Factura selecionarPorNumero(String numero);

	public void insertar(Factura factura);
	
	public void actualizar(Factura factura);
	
	public int actualizarFechas (LocalDate fechaNueva, LocalDate fechaActual);
	
	public void eliminar (Integer id);
	
	public int eliminarPorNumero (String numero);

	public List<Factura> seleccionarInnerJoin();
	
	public List<Factura> seleccionarPorRightJoin();
	
	public List<Factura> seleccionarPorLeftJoin();
	
	public List<Factura> seleccionarPorFullJoin();
	
	public List<Factura> seleccionarPorWhereJoin();
	
	public List<Factura> seleccionarPorFetchJoin();
	
	public List<FacturaDTO> seleccionarFacturasDTO();
}
