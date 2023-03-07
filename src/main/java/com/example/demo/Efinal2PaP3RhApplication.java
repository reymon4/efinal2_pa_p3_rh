package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.modelo.Bodega;
import com.example.demo.repo.modelo.Inventario;
import com.example.demo.repo.modelo.Producto;
import com.example.demo.service.IBodegaSer;
import com.example.demo.service.IInventarioSer;
import com.example.demo.service.IProductoSer;

@SpringBootApplication
public class Efinal2PaP3RhApplication implements CommandLineRunner{

	@Autowired
	private IBodegaSer bodegaSer;
	
	@Autowired
	private IProductoSer iProductoSer;
	
	@Autowired
	private IInventarioSer iInventarioSer;
	
	public static void main(String[] args) {
		SpringApplication.run(Efinal2PaP3RhApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		Producto pro = new Producto();
//		pro.setCategoria("Bebidas");
//		pro.setCodigo("B001");
//		//this.iProductoSer.insertar(pro);
//		
//		Bodega bodega = new Bodega();
//		bodega.setDireccion("San Diego");
//		bodega.setNombre("Carnicería el Rey2");
//		bodega.setNumero("SD002");
//		bodega.setTelefono("2587628");
//		//this.bodegaSer.insertar(bodega);
//		
//	this.iInventarioSer.ingresarProductos("SD002", "B001", 15);
//		System.out.println("Finish!");
		
	}

}
