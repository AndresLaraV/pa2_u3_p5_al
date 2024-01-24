package com.uce.edu.ec;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.ec.ventas.repository.modelo.DetalleFactura;
import com.uce.edu.ec.ventas.repository.modelo.Factura;
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
		Factura fac = new Factura();
		fac.setCedula("1722121835");
		fac.setFecha(LocalDate.now());
		fac.setNumero("0001-02569");
		
		DetalleFactura det1 = new DetalleFactura();
		det1.setCantidad(4);
		det1.setCodigoBarras("54545454");
		det1.setNombreProducto("CocaCola");
		det1.setFactura(fac);
		
		
		DetalleFactura det2 = new DetalleFactura();
		det2.setCantidad(4);
		det2.setCodigoBarras("45454545");
		det2.setNombreProducto("Nutri Leche");
		det1.setFactura(fac);
		
		List<DetalleFactura> lista = new ArrayList<>();
		lista.add(det1);
		lista.add(det2);
		
		fac.setDetalleFacturas(lista);
		
		//this.facturaService.guardar(fac);
		
		Factura fact01 = this.facturaService.buscarPorNumero("0001-02569");
		System.out.println(fact01);
		
	}

}
