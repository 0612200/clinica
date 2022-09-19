package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Agenda {

	private Paciente paciente;
	private Especialidade especialidade;
	private Medico medico;
	private LocalDate dataDaConsulta;
	private LocalTime horaDaConsulta;
	private String observaçao;
	private boolean comparecimento;

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public void setDataDaConsulta(LocalDate dataDaConsulta) {
		this.dataDaConsulta = dataDaConsulta;
	}
	
	public LocalDate getDataDaConsulta() {
		return dataDaConsulta;
	}

	public LocalTime getHoraDaConsulta() {
		return horaDaConsulta;
	}

	public void setHoraDaConsulta(LocalTime horaDaConsulta) {
		this.horaDaConsulta = horaDaConsulta;
	}

	public String getObservaçao() {
		return observaçao;
	}

	public void setObservaçao(String observaçao) {
		this.observaçao = observaçao;
	}

	public boolean isComparecimento() {
		return comparecimento;
	}

	public void setComparecimento(boolean comparecimento) {
		this.comparecimento = comparecimento;
	}

}
