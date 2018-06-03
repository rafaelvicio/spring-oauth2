package br.com.casadocodigo.usuarios;

import javax.persistence.Embeddable;

import lombok.Getter;

@Embeddable
public class Credenciais {

	private String email;
	
	private String senha;

	@Deprecated
	Credenciais() {}
	
	public Credenciais(String email, String senha) {
		super();
		this.email = email;
		this.senha = senha;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}
	
}
