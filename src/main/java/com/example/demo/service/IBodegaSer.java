package com.example.demo.service;

import com.example.demo.repo.modelo.Bodega;

public interface IBodegaSer {
	public void insertar(Bodega bodega);
	public Bodega buscarPorNumero(String numero);

}
