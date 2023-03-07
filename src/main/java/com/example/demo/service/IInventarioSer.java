package com.example.demo.service;

import com.example.demo.repo.modelo.Inventario;

public interface IInventarioSer {

	public void insertar(Inventario inventario);
	
	public void ingresarProductos(String numeroBodega, String codigo, Integer cantidad);
	
}
