package atividadePratica6AbstracaomaisLogica;

public class atendimentoSUSFila {

	public static void main(String[] args) {
		
		Fila filaAtendimento = new Fila(10);
		
		filaAtendimento.chegarPaciente("Paciente 1");
		filaAtendimento.chegarPaciente("Paciente 2");
		filaAtendimento.chegarPaciente("Paciente 3");
		filaAtendimento.chegarPaciente("Paciente 4");
		filaAtendimento.chegarPaciente("Paciente 5");

		while (!filaAtendimento.estaVazia()) {
			filaAtendimento.atenderPacientes();
		}
	}

}

class Fila {
	private String[] pacientes;
	private int inicio;
	private int fim;
	private int tamanho;
	private int capacidade;
	
	public Fila(int capacidade) {
		this.capacidade = capacidade;
		this.pacientes = new String[capacidade];
		this.inicio = 0;
		this.fim = -1;
		this.tamanho = 0;
	}
	
	public void chegarPaciente(String nomePaciente) {
		if (tamanho == capacidade) {
			System.out.println("Fila cheia! "+ nomePaciente + " não pode ser adicionado. ");
			return;
		}
		
		fim = (fim+1) % capacidade;
		pacientes[fim] = nomePaciente;
		tamanho++;
		
		System.out.println(nomePaciente + " chegou e entrou na fila. ");
		System.out.println("Tamanho atual da fila " + tamanho);
	}
	
	public void atenderPacientes() {
		if (estaVazia()) {
			System.out.println("Não há pacientes para atender. ");
			return;
		}
		
		String pacienteAtendido = pacientes[inicio];
		pacientes[inicio] = null;
		inicio = (inicio+1) % capacidade;
		tamanho--;
		System.out.println("Atendendo: " + pacienteAtendido);
		
		if (!estaVazia()) {
			pacienteAtendido = pacientes[inicio];
			pacientes[inicio] = null;
			inicio = (inicio + 1) % capacidade;
			tamanho--;
			System.out.println("Atendendo: " + pacienteAtendido);
		}
		
		System.out.println("Pacientes restantes na fila: " + tamanho);
	}
	
	public boolean estaVazia() {
		return tamanho == 0;
	}
	
	public int tamanhoFila() {
		return tamanho;
	}
	
}