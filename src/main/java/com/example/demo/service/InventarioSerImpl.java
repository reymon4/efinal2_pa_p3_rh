package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IBodegaRepo;
import com.example.demo.repo.IInventarioRepo;
import com.example.demo.repo.IProductoRepo;
import com.example.demo.repo.modelo.Bodega;
import com.example.demo.repo.modelo.Inventario;
import com.example.demo.repo.modelo.Producto;

@Service
public class InventarioSerImpl implements IInventarioSer {

	@Autowired
	private IInventarioRepo iInventarioRepo;

	@Autowired
	private IBodegaRepo bodegaRepo;

	@Autowired
	private IProductoRepo iProductoRepo;

	@Override
	public void insertar(Inventario inventario) {
		// TODO Auto-generated method stub
		this.iInventarioRepo.insertar(inventario);
	}

	@Override
	public void ingresarProductos(String numeroBodega, String codigo, Integer cantidad) {
		// TODO Auto-generated method stub

		Bodega bod = this.bodegaRepo.buscarPorNumero(numeroBodega);
		Producto pro = this.iProductoRepo.buscarPorCodigo(codigo);
		pro.setStock(cantidad);
		this.iProductoRepo.actualizar(pro);

		Integer contador = cantidad;

		while (contador != 0) {
			Inventario inv = new Inventario();
			inv.setBodega(bod);
			inv.setProducto(pro);
			inv.setBodega(bod);
			inv.setProducto(pro);

			inv.setCodigo(codigo.concat(contador.toString()));
			this.insertar(inv);
			contador--;
			System.out.println("FinishINV");

		}

	}

}
