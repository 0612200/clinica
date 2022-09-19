package br.senai.sp.jandira.model;

public class Paciente {

	private String nome;
	private String email;
	private PlanoDeSaude planoDeSaude;
	private String DataDeNascimento ;
	private String RG;
	private String CPF;
	private String Telefone;
	private Genero genero;
	private String TipoSanguineo;
	private String Endereço;
	
	
	// Métodos de acesso 
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	
	public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
		this.planoDeSaude = planoDeSaude;
	}
	public PlanoDeSaude getPlanoDeSaude() {
		return planoDeSaude;
	}
	
	public void setDataDeNascimento(String DataDeNascimento ) {
		this.DataDeNascimento = DataDeNascimento; 
	}
		public String DataDeNascimento() {
			return DataDeNascimento;
		}
		
	public void setRG(String RG) {
		this.RG = RG;
	}
		public String RG() {
			return RG;
		}
		
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	    public String CPF() {
	    	return CPF;
	    }
	    
	public void setTelefone(String Telefone) {
		this.Telefone = Telefone;
	}
		public String Telefoe() {
			return Telefone;
		}
		

     public void setGenero(Genero genero) {
		this.genero = genero;
	}
     public Genero getGenero() {
		return genero;
	}
		
		
	public void setTipoSanguineo(String TipoSanguineo) {
		this.TipoSanguineo = TipoSanguineo;
	}
		public String TipoSanguineo() {
			return TipoSanguineo;
		}
	public void setEndereço(String Endereço) {
		this.Endereço = Endereço;
	}
		public String Endereço() {
			return Endereço;
		}
}

