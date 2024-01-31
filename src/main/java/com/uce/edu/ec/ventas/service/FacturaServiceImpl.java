package com.uce.edu.ec.ventas.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.ec.ventas.repository.IFacturaRepository;
import com.uce.edu.ec.ventas.repository.modelo.Factura;
import com.uce.edu.ec.ventas.repository.modelo.dto.FacturaDTO;

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

	@Override
	public List<Factura> buscarInnerJoin() {
		// TODO Auto-generated method stub
		return this.FacturaRepository.seleccionarInnerJoin();
	}

	@Override
	public List<Factura> buscarPorRightJoin() {
		// TODO Auto-generated method stub
		return this.FacturaRepository.seleccionarPorRightJoin();
	}

	@Override
	public List<Factura> buscarPorLeftJoin() {
		// TODO Auto-generated method stub
		return this.FacturaRepository.seleccionarPorLeftJoin();
	}

	@Override
	public List<Factura> buscarPorFullJoin() {
		// TODO Auto-generated method stub
		return this.FacturaRepository.seleccionarPorFullJoin();
	}

	@Override
	public List<Factura> buscarPorWhereJoin() {
		// TODO Auto-generated method stub
		return this.FacturaRepository.seleccionarPorWhereJoin();
	}

	@Override
	public List<Factura> buscarPorFetchJoin() {
		// TODO Auto-generated method stub
		return this.FacturaRepository.seleccionarPorFetchJoin();
	}

	@Override
	public void actualizar(Factura factura) {
		// TODO Auto-generated method stub
		this.FacturaRepository.actualizar(factura);
	}

	@Override
	public int actualizarFechas(LocalDate fechaNueva, LocalDate fechaActual) {
		// TODO Auto-generated method stub
		return this.FacturaRepository.actualizarFechas(fechaNueva, fechaActual);

	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.FacturaRepository.eliminar(id);
	}

	@Override
	public int borrarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.FacturaRepository.eliminarPorNumero(numero);
	}

	@Override
	public List<FacturaDTO> buscarFacturasDTO() {
		// TODO Auto-generated method stub
		return this.FacturaRepository.seleccionarFacturasDTO();
	}

}
