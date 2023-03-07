package com.example.demo.repo;

import com.example.demo.repo.modelo.Bodega;
import com.example.demo.repo.modelo.Producto;

public interface IProductoRepo {
	public void insertar(Producto producto);
	public Producto buscarPorCodigo(String codigo);
	public void actualizar(Producto producto);

}
