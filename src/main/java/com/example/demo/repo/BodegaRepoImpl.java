package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Bodega;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class BodegaRepoImpl implements IBodegaRepo{

	
	@PersistenceContext
	private EntityManager eM;
	@Override
	public void insertar(Bodega bodega) {
		// TODO Auto-generated method stub
		this.eM.persist(bodega);
	}

	@Override
	public Bodega buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		
		TypedQuery<Bodega> query = this.eM.createQuery("SELECT b FROM Bodega b where b.numero=:datoNumero", Bodega.class);
		query.setParameter("datoNumero", numero);
		
		return query.getSingleResult();
	}
	
	
	

}
