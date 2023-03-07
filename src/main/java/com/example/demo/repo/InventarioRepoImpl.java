package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Inventario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class InventarioRepoImpl implements IInventarioRepo{

	
	@PersistenceContext
	private EntityManager eM;

	@Override
	public void insertar(Inventario inventario) {
		// TODO Auto-generated method stub
		this.eM.persist(inventario);
	}
	
	
	
	
}
