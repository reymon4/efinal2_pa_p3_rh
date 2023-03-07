package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Bodega;
import com.example.demo.repo.modelo.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProductoRepoImpl implements IProductoRepo {

	@PersistenceContext
	private EntityManager eM;

	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		this.eM.persist(producto);
	}

	@Override
	public Producto buscarPorCodigo(String codigo) {
		// TODO Auto-generated method stub

		TypedQuery<Producto> query = this.eM.createQuery("SELECT p FROM Producto p where p.codigo=:datoCodigo", Producto.class);
		query.setParameter("datoCodigo", codigo);
		
		return query.getSingleResult();
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		this.eM.merge(producto);
	}
}
