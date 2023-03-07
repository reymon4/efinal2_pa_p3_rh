package com.example.demo.service;

import com.example.demo.repo.modelo.Producto;

public interface IProductoSer {
	public void insertar(Producto producto);
	public Producto buscarPorCodigo(String codigo);
	public void actualizar(Producto producto);

}
