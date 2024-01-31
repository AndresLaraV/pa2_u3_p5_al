package com.uce.edu.ec;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.ec.ventas.repository.modelo.dto.FacturaDTO;
import com.uce.edu.ec.ventas.service.IFacturaService;

@SpringBootApplication
public class Pa2U3P5AlApplication implements CommandLineRunner {
	@Autowired
	private IFacturaService facturaService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P5AlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("UPDATE");
		int cantidad = this.facturaService.actualizarFechas(LocalDate.of(2024, 1, 24), LocalDate.of(2024, 1, 26));
		System.out.println("Cantidad actualizados");
		System.out.println(cantidad);	
		
		System.out.println("ELIMINAR");	
		int cantidadElim = this.facturaService.borrarPorNumero("0001-02571");
		System.out.println("cantidad de registros/filas eliminados: "+ cantidadElim);

		System.out.println("DTO");
		List<FacturaDTO> listDTO = this.facturaService.buscarFacturasDTO();
		for (FacturaDTO fDTO : listDTO) {
			System.out.println(fDTO);
		}
	}

}
