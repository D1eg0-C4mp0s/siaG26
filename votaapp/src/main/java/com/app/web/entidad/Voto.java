package com.app.web.entidad;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Voto {

	@Id
	private int codVoto;
	private int idenCandidato;
	private int identificacion;
	private String fechaHora;
	
	public int getCodVoto() {
		return codVoto;
	}
	public void setCodVoto(int codVoto) {
		this.codVoto = codVoto;
	}
	public int getIdenCandidato() {
		return idenCandidato;
	}
	public void setIdenCandidato(int idenCandidato) {
		this.idenCandidato = idenCandidato;
	}
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	public String getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}
	
	
	
	
	
}
