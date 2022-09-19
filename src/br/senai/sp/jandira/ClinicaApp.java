package br.senai.sp.jandira;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereço;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Estados;
import br.senai.sp.jandira.model.Genero;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class ClinicaApp {

	public static void main(String[] args) {
		
		//Criar um plano de saude 
		PlanoDeSaude plano = new PlanoDeSaude();
		plano.setOperadora("Unimed");
		plano.setTipoDoPlano("Prata");
		
		// criar um endereço
		Endereço endereço = new Endereço();
		endereço.setLogradouro("Rua Elton Silva");
		endereço.setNumero("905");
		endereço.setCidade("Jandira");
		endereço.setBairro("Centro");
		endereço. setEstados(Estados.SAO_PAULO);
		endereço.setTipo("");
		endereço.setComplemento("Instituiçao de ensino");
		endereço.setPontDeReferencia("Em frente a prefeitura");
		endereço.setCep("06600-025");
		
		//Criar um paciente
		Paciente paciente = new Paciente();
		paciente.setNome("Anna");
		paciente.setEmail("ann@uol.com.br");
		paciente.setCPF("123.456.789-00");
		paciente.setRG("123.456.99");
		paciente.setTelefone("(11)98745-6523");
		paciente.setTipoSanguineo("O+");
		paciente.setGenero(Genero.FAMININO);
		paciente.setEndereço("endereço");
		paciente.setPlanoDeSaude(plano);
		
		//criar especialidade madica
		Especialidade especialidade1 = new Especialidade();
		especialidade1.setNome("Cardiologia");
		
		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Otorrinolaringologia");
		
		Especialidade especialidade3 = new Especialidade();
		especialidade3.setNome("Clinica Geral");
		
		// Criar um medico
		Medico medico1 = new Medico();
		medico1.setNome("Marcos Pereira");
		medico1.setCrm("4562-9");
		medico1.setSexo("Masculino");
		medico1.setDataDeNascimento(LocalDate.of(1990, 6, 8));
		
		//criar a lista do Dr.Marcos
		Especialidade[] especialidadesMedico1 = {especialidade1, especialidade3};
		
		medico1.setEspecialidade(especialidadesMedico1);
		
		//criar outro medico2
		Medico medico2 = new Medico();
		medico2.setNome("Fabiana Gomes");
		medico2.setCrm("3214-5");
		medico2.setSexo("Feminino");
		medico2.setDataDeNascimento(LocalDate.of(1984, 11, 27));
		
		Especialidade[] especialidadesMedico2 = {especialidade2};
		
		medico2.setEspecialidade(especialidadesMedico2);
		
		//Criar uma agenda
		//A paciente Patricia ligou na clinica para agendar uma consulta
		//com um clinico geral para 22/09/2022 as 14h20
		
		Agenda agenda1 = new Agenda();
		agenda1.setPaciente(paciente);
		agenda1.setEspecialidade(especialidade3);
		agenda1.setMedico(medico1);
		agenda1.setDataDaConsulta(LocalDate.of(2022, 9, 22));
		agenda1.setHoraDaConsulta(LocalTime.of(14, 20));
		agenda1.setObservaçao("Paciente reclamando de dor nas cotas");
		agenda1.setComparecimento(false);
		
		//** Imprimir dados do agendamento
		//Nome do paciente
		//Nome do medico
		//especialidade
		//Dia e hora da consulta
		
		System.out.println("Nome do pacinte:" + agenda1.getPaciente().getNome());
		System.out.println("Nome do medico:" + agenda1.getMedico().getNome());
		System.out.println("Especialidade:" + agenda1.getEspecialidade().getNome());
		System.out.println("Dia e hora:" + agenda1.getDataDaConsulta() + "-" + agenda1.getHoraDaConsulta());
		System.out.println("Plano de saude" + agenda1.getPaciente().getPlanoDeSaude().getDadosDoPlano());
		
		
		
	}

}
