package com.example.demo.repo;

import com.example.demo.repo.modelo.Bodega;

public interface IBodegaRepo {
	
	public void insertar(Bodega bodega);
	public Bodega buscarPorNumero(String numero);
	
	

}
