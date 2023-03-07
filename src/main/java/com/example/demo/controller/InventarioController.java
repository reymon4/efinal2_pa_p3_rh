package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repo.modelo.Bodega;
import com.example.demo.repo.modelo.Inventario;
import com.example.demo.repo.modelo.Producto;
import com.example.demo.service.IBodegaSer;
import com.example.demo.service.IInventarioSer;
import com.example.demo.service.IProductoSer;

@Controller
@RequestMapping("/inventarios") 
public class InventarioController {
	@Autowired
	private IProductoSer iProductoSer;
	
	
	@Autowired 
	private IBodegaSer bodegaSer;
	
	@Autowired 
	private IInventarioSer iInventarioSer;
	
	
	@GetMapping("/opcion")
	public String paginaInicio(Inventario inventario, Bodega bodega, Producto producto) {
		return "vistaInicio";
	
	}
	@GetMapping("/bodegaInsertar")
	public String paginaInsertarBodega(Bodega bodega) {
		return "vistaBodega";
	
	}
	
	
	@PostMapping("/bodega")
	public String insertarBodega(Bodega bodega) {
		this.bodegaSer.insertar(bodega);
		System.out.println("Insertado!");
		return "vistaInicio";

	}	
		
	
	}

