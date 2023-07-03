package br.itb.projeto.captacaoabs.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Usuario")
public class Usuario {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long id;
     private String name; 
     private String email;
     private String senha;
     private String nivelAcesso;
     private byte foto;
     private String statusUsuario;
     
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNivelAcesso() {
		return nivelAcesso;
	}
	public void setNivelAcesso(String nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}
	public byte getFoto() {
		return foto;
	}
	public void setFoto(byte foto) {
		this.foto = foto;
	}
	public String getStatusUsuario() {
		return statusUsuario;
	}
	public void setStatusUsuario(String statusUsuario) {
		this.statusUsuario = statusUsuario;
	}

     
	
}
