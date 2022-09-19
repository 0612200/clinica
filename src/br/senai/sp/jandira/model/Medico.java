package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Medico {
	
	private String nome;
	private LocalDate dataDeNascimento;
	private String Sexo;
	private Especialidade[] especialidade;
	private String crm;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String  nome) {
		this.nome = nome;
	}
	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public Especialidade[] getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(Especialidade[] especialidade) {
		this.especialidade = especialidade;
	}
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	
	

}
