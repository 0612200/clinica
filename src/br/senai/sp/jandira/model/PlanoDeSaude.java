package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class PlanoDeSaude {
	
	private String operadora;
	private String tipoDoPlano;
	
	// Métodos de acesso
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	
	public String getOperadora() {
		return this.operadora;
	}
	
	public void setTipoDoPlano(String tipoDoPlano) {
		this.tipoDoPlano = tipoDoPlano;
	}
	
	public String getTipoDoPlano() {
		return this.tipoDoPlano;
	}
	
	public String getDadosDoPlano() {
		return "Plano: " + this.operadora + " , " + this.tipoDoPlano;
		
	}

}
