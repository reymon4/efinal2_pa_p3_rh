package com.example.demo.repo.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pro_seq")
	@SequenceGenerator(name = "pro_seq", sequenceName = "pro_seq", allocationSize = 1)
	@Column(name = "pro_id")
	private Integer id;

	
	@Column(name = "pro_codigo")
	private String codigo;
	
	@Column(name = "pro_categoria")
	private String categoria;
	
	
	@Column(name = "pro_stock")
	private Integer stock;
	
	
	@OneToMany(mappedBy="producto", cascade = CascadeType.ALL, fetch = FetchType.LAZY) 
	private List<Inventario> inventarios;


	public List<Inventario> getInventarios() {
		return inventarios;
	}


	public void setInventarios(List<Inventario> inventarios) {
		this.inventarios = inventarios;
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


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public Integer getStock() {
		return stock;
	}


	public void setStock(Integer stock) {
		this.stock = stock;
	}


	@Override
	public String toString() {
		return "Producto [id=" + id + ", codigo=" + codigo + ", categoria=" + categoria + ", stock=" + stock
				+ ", inventarios=" + inventarios + "]";
	}


	
	
	
	
	
	
	
	
	
	

	
}
