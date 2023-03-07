package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IBodegaRepo;
import com.example.demo.repo.modelo.Bodega;

@Service
public class BodegaSerImpl implements IBodegaSer {

	
	@Autowired
	private IBodegaRepo bodegaRepo;
	@Override
	public void insertar(Bodega bodega) {
		// TODO Auto-generated method stub
		this.bodegaRepo.insertar(bodega);
	}

	@Override
	public Bodega buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.bodegaRepo.buscarPorNumero(numero);
	}

}
