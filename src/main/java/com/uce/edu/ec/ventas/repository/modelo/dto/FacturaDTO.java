package com.uce.edu.ec.ventas.repository.modelo.dto;

import java.time.LocalDate;

public class FacturaDTO {
	private String numero;
	private LocalDate fecha;

	// constructor por defecto
	public FacturaDTO() {

	}
	// constructor explicito con los atributos source generates constructor usingg
	// files
	public FacturaDTO(String numero, LocalDate fecha) {
		super();
		this.numero = numero;
		this.fecha = fecha;
	}

	// SET y GET
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "FacturaDTO [numero=" + numero + ", fecha=" + fecha + "]";
	}
	
	
}
