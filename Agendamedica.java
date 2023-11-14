package clinica;

public class Agendamedica {
	
	Marcacaohorario[]  marca_horario = new  Marcacaohorario[8];
	String horario;
	
	
	
	public void agendar(String nomepaciente,String horario) {
		this.horario=nomepaciente;
		this.horario=horario;
		
	}
	
	public void verificarhorario(String horario) {
		this.horario=horario;
	}
	
	public void verificarpaciente(String nome) {
		
		
	}

}
