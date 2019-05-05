package com.uca.capas.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


public class Product {
	
	@Size(message="La longitud debe ser de 30 caracteres",max=30)
	@NotEmpty(message="El campo no debe ir vacio")
	private String nombre;
	@Size(message="La longitud debe ser de 30 caracteres",max=30)
	@NotEmpty(message="El campo no debe ir vacio")
	private String marca;
	@Size(message="La longitud debe ser de 30 caracteres",max=30)
	@NotEmpty(message="El campo no debe ir vacio")
	private String descripcion;
	@Size(message="La longitud debe ser de 30 caracteres",max=30)
	@NotEmpty(message="El campo no debe ir vacio")
	private String categoria;
	@Min(0)
	private float precio;
	@NotEmpty
	private String fechaVen;
	
	public Product() {}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public float getPrecio() {
		return precio;
	}
	
	public String getFechaVen() {
		return fechaVen;
	}
	public String getCategoria() {
		return categoria;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public void setFechaVen(String fechaVen) {
		this.fechaVen = fechaVen;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	


}
