package com.app.web.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "votante")
public class Votante {

	@Id
	private int identificacion;
	@Column(name = "nombres")
	private String nombres;
	private String clave;
	@Column(name = "telefono")
	private int telefono;
	@Column(name = "correo")
	private String correo;
	
	
	public Votante() {
	}
	
	public Votante(int identificacion, String nombres, String clave, int telefono, String correo) {
		this.identificacion = identificacion;
		this.nombres = nombres;
		this.clave = clave;
		this.telefono = telefono;
		this.correo = correo;
	}
	
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
	
	
	
	
}
