package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IProductoRepo;
import com.example.demo.repo.modelo.Producto;

@Service
public class ProductoSerImpl implements IProductoSer{

	@Autowired
	private IProductoRepo iProductoRepo;	
	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		producto.setStock(0);
		this.iProductoRepo.insertar(producto);
	}

	@Override
	public Producto buscarPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		return this.iProductoRepo.buscarPorCodigo(codigo);
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		this.iProductoRepo.actualizar(producto);
	}

}
