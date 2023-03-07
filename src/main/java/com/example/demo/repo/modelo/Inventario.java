package com.example.demo.repo.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="inventario")
public class Inventario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inv_seq")
	@SequenceGenerator(name = "inv_seq", sequenceName = "inv_seq", allocationSize = 1)
	@Column(name = "inv_id")
	private Integer id;
	
	@Column(name = "inv_codigo")
	private String codigo;
	
	
	
	@ManyToOne(cascade = CascadeType.MERGE) 
	@JoinColumn(name="inv_id_producto") 
	private Producto producto;
	
	@ManyToOne(cascade = CascadeType.MERGE) 
	@JoinColumn(name="inv_id_bodega") 
	private Bodega bodega;

	
	




	public Producto getProducto() {
		return producto;
	}





	public void setProducto(Producto producto) {
		this.producto = producto;
	}





	public Bodega getBodega() {
		return bodega;
	}





	public void setBodega(Bodega bodega) {
		this.bodega = bodega;
	}





	public Integer getId() {
		return id;
	}





	public void setId(Integer id) {
		this.id = id;
	}





	public String getCodigo() {
		return codigo;
	}





	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}






	
	
}
