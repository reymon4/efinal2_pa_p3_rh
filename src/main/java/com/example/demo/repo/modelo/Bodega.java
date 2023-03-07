package com.example.demo.repo.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="bodega")
public class Bodega {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bod_seq")
	@SequenceGenerator(name = "bod_seq", sequenceName = "bod_seq", allocationSize = 1)
	@Column(name = "bod_id")
	private Integer id;
	
	
	@Column(name = "bod_nombre")
	private String nombre;
	
	
	@Column(name = "bod_numero")
	private String numero;
	
	
	@Column(name = "bod_direccion")
	private String direccion;
	
	
	@Column(name = "bod_telefono")
	private String telefono;

	
	@OneToMany(mappedBy="bodega", cascade = CascadeType.ALL, fetch = FetchType.LAZY) 
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


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	@Override
	public String toString() {
		return "Bodega [id=" + id + ", nombre=" + nombre + ", numero=" + numero + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", inventarios=" + inventarios + "]";
	}


	
	

	
}
