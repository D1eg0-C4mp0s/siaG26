package com.app.web.entidad;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Candidato {
	@Id
	private int idenCandidato;
	private String nombres;
	private String foto;
	private String descripcion;
	private String urlPartido;
	
	
	
	public int getIdenCandidato() {
		return idenCandidato;
	}
	public void setIdenCandidato(int idenCandidato) {
		this.idenCandidato = idenCandidato;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getUrlPartido() {
		return urlPartido;
	}
	public void setUrlPartido(String urlPartido) {
		this.urlPartido = urlPartido;
	}
	
	
	
	
	
	
}
