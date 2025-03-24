package atividadepratica4TreinoAbstracao;

public class TreinoAbstracao {

	public static void main(String[] args) {
		// Computador
		class Computador {
		    private String marca;
		    private String processador;
		    private int memoriaRAM;

		    public Computador(String marca, String processador, int memoriaRAM) {
		        this.marca = marca;
		        this.processador = processador;
		        this.memoriaRAM = memoriaRAM;
		    }

		    public void ligar() {
		        System.out.println("Computador ligado.");
		    }

		    public void executarPrograma(String programa) {
		        System.out.println("Executando " + programa + "...");
		    }

		    public void exibirEspecificacoes() {
		        System.out.println("Marca: " + marca + ", Processador: " + processador + ", Memória RAM: " + memoriaRAM + "GB");
		    }
		}

		// Telescópio
		class Telescopio {
		    private double diametroLente;
		    private String tipoMontagem;
		    private double aumentoMaximo;

		    public Telescopio(double diametroLente, String tipoMontagem, double aumentoMaximo) {
		        this.diametroLente = diametroLente;
		        this.tipoMontagem = tipoMontagem;
		        this.aumentoMaximo = aumentoMaximo;
		    }

		    public void observar(String objeto) {
		        System.out.println("Observando " + objeto + "...");
		    }

		    public void ajustarFoco() {
		        System.out.println("Foco ajustado.");
		    }

		    public void exibirDetalhes() {
		        System.out.println("Diâmetro da lente: " + diametroLente + "mm, Montagem: " + tipoMontagem + ", Aumento máximo: " + aumentoMaximo + "x");
		    }
		}

		// Girafa
		class Girafa {
		    private double altura;
		    private String padraoPelagem;
		    private int idade;

		    public Girafa(double altura, String padraoPelagem, int idade) {
		        this.altura = altura;
		        this.padraoPelagem = padraoPelagem;
		        this.idade = idade;
		    }

		    public void comerFolhas() {
		        System.out.println("Girafa está comendo folhas.");
		    }

		    public void correr() {
		        System.out.println("Girafa está correndo.");
		    }

		    public void exibirInformacoes() {
		        System.out.println("Altura: " + altura + "m, Padrão de pelagem: " + padraoPelagem + ", Idade: " + idade + " anos");
		    }
		}
		
		// Smartphone
		class Smartphone {
		    private String marca;
		    private String sistemaOperacional;
		    private int capacidadeBateria;

		    public Smartphone(String marca, String sistemaOperacional, int capacidadeBateria) {
		        this.marca = marca;
		        this.sistemaOperacional = sistemaOperacional;
		        this.capacidadeBateria = capacidadeBateria;
		    }

		    public void ligar() {
		        System.out.println("Smartphone ligado.");
		    }

		    public void tirarFoto() {
		        System.out.println("Foto tirada.");
		    }

		    public void exibirEspecificacoes() {
		        System.out.println("Marca: " + marca + ", Sistema Operacional: " + sistemaOperacional + ", Bateria: " + capacidadeBateria + "mAh");
		    }
		}

		// Via Láctea
		class ViaLactea {
		    private double diametroAnosLuz;
		    private String tipoGalaxia;
		    private int numeroEstrelas;

		    public ViaLactea(double diametroAnosLuz, String tipoGalaxia, int numeroEstrelas) {
		        this.diametroAnosLuz = diametroAnosLuz;
		        this.tipoGalaxia = tipoGalaxia;
		        this.numeroEstrelas = numeroEstrelas;
		    }

		    public void rotacionar() {
		        System.out.println("Galáxia está rotacionando.");
		    }

		    public void formarEstrelas() {
		        System.out.println("Formando novas estrelas.");
		    }

		    public void exibirDetalhes() {
		        System.out.println("Diâmetro: " + diametroAnosLuz + " anos-luz, Tipo: " + tipoGalaxia + ", Estrelas: " + numeroEstrelas);
		    }
		}

		// Câmera Digital
		class CameraDigital {
		    private int resolucaoMP;
		    private String tipoLente;
		    private boolean comFlash;

		    public CameraDigital(int resolucaoMP, String tipoLente, boolean comFlash) {
		        this.resolucaoMP = resolucaoMP;
		        this.tipoLente = tipoLente;
		        this.comFlash = comFlash;
		    }

		    public void tirarFoto() {
		        System.out.println("Foto capturada com " + resolucaoMP + "MP.");
		    }

		    public void gravarVideo() {
		        System.out.println("Gravando vídeo...");
		    }

		    public void exibirDetalhes() {
		        System.out.println("Resolução: " + resolucaoMP + "MP, Lente: " + tipoLente + ", Flash: " + (comFlash ? "Sim" : "Não"));
		    }
		}
		
		// Renascimento
		class Renascimento {
		    private int anoInicio;
		    private int anoFim;
		    private String principalArtista;

		    public Renascimento(int anoInicio, int anoFim, String principalArtista) {
		        this.anoInicio = anoInicio;
		        this.anoFim = anoFim;
		        this.principalArtista = principalArtista;
		    }

		    public void influenciarArte() {
		        System.out.println("Influenciando a arte moderna.");
		    }

		    public void promoverCiencia() {
		        System.out.println("Promovendo avanços científicos.");
		    }

		    public void exibirPeriodo() {
		        System.out.println("Período: " + anoInicio + " - " + anoFim + ", Artista principal: " + principalArtista);
		    }
		}

		// Coelho
		class Coelho {
		    private String especie;
		    private double peso;
		    private int idade;

		    public Coelho(String especie, double peso, int idade) {
		        this.especie = especie;
		        this.peso = peso;
		        this.idade = idade;
		    }

		    public void pular() {
		        System.out.println("Coelho está pulando.");
		    }

		    public void comerCenoura() {
		        System.out.println("Coelho está comendo cenoura.");
		    }

		    public void exibirInformacoes() {
		        System.out.println("Espécie: " + especie + ", Peso: " + peso + "kg, Idade: " + idade + " anos");
		    }
		}

		// Nebulosa
		class Nebulosa {
		    private String tipo;
		    private double distanciaTerraAnosLuz;
		    private String cor;

		    public Nebulosa(String tipo, double distanciaTerraAnosLuz, String cor) {
		        this.tipo = tipo;
		        this.distanciaTerraAnosLuz = distanciaTerraAnosLuz;
		        this.cor = cor;
		    }

		    public void emitirLuz() {
		        System.out.println("Nebulosa emitindo luz.");
		    }

		    public void formarEstrelas() {
		        System.out.println("Formando novas estrelas.");
		    }

		    public void exibirDetalhes() {
		        System.out.println("Tipo: " + tipo + ", Distância: " + distanciaTerraAnosLuz + " anos-luz, Cor: " + cor);
		    }
		}
		
		// Bolsa de Valores
		class BolsaValores {
		    private String nome;
		    private double indice;
		    private int numeroEmpresas;

		    public BolsaValores(String nome, double indice, int numeroEmpresas) {
		        this.nome = nome;
		        this.indice = indice;
		        this.numeroEmpresas = numeroEmpresas;
		    }

		    public void abrirMercado() {
		        System.out.println("Mercado aberto.");
		    }

		    public void fecharMercado() {
		        System.out.println("Mercado fechado.");
		    }

		    public void exibirInformacoes() {
		        System.out.println("Nome: " + nome + ", Índice: " + indice + ", Empresas listadas: " + numeroEmpresas);
		    }
		}

		// Trator
		class Trator {
		    private String marca;
		    private int potenciaHP;
		    private boolean comCabine;

		    public Trator(String marca, int potenciaHP, boolean comCabine) {
		        this.marca = marca;
		        this.potenciaHP = potenciaHP;
		        this.comCabine = comCabine;
		    }

		    public void ararTerra() {
		        System.out.println("Arando a terra.");
		    }

		    public void transportarCarga() {
		        System.out.println("Transportando carga.");
		    }

		    public void exibirDetalhes() {
		        System.out.println("Marca: " + marca + ", Potência: " + potenciaHP + "HP, Cabine: " + (comCabine ? "Sim" : "Não"));
		    }
		}

		// Gato
		class Gato {
		    private String raca;
		    private double peso;
		    private int idade;

		    public Gato(String raca, double peso, int idade) {
		        this.raca = raca;
		        this.peso = peso;
		        this.idade = idade;
		    }

		    public void miar() {
		        System.out.println("Miau!");
		    }

		    public void dormir() {
		        System.out.println("Gato está dormindo.");
		    }

		    public void exibirInformacoes() {
		        System.out.println("Raça: " + raca + ", Peso: " + peso + "kg, Idade: " + idade + " anos");
		    }
		}
		
		// Impressora
		class Impressora {
		    private String marca;
		    private String tecnologia;
		    private int velocidadeImpressao;

		    public Impressora(String marca, String tecnologia, int velocidadeImpressao) {
		        this.marca = marca;
		        this.tecnologia = tecnologia;
		        this.velocidadeImpressao = velocidadeImpressao;
		    }

		    public void imprimir(String documento) {
		        System.out.println("Imprimindo " + documento + "...");
		    }

		    public void escanear() {
		        System.out.println("Escaneando documento.");
		    }

		    public void exibirEspecificacoes() {
		        System.out.println("Marca: " + marca + ", Tecnologia: " + tecnologia + ", Velocidade: " + velocidadeImpressao + "ppm");
		    }
		}

		// Buraco Negro
		class BuracoNegro {
		    private double massa;
		    private double raio;
		    private String localizacao;

		    public BuracoNegro(double massa, double raio, String localizacao) {
		        this.massa = massa;
		        this.raio = raio;
		        this.localizacao = localizacao;
		    }

		    public void absorverMateria() {
		        System.out.println("Absorvendo matéria próxima.");
		    }

		    public void emitirRadiação() {
		        System.out.println("Emitindo radiação Hawking.");
		    }

		    public void exibirDetalhes() {
		        System.out.println("Massa: " + massa + " massas solares, Raio: " + raio + "km, Localização: " + localizacao);
		    }
		}

		// Planeta
		class Planeta {
		    private String nome;
		    private double distanciaSol;
		    private int numeroLuas;

		    public Planeta(String nome, double distanciaSol, int numeroLuas) {
		        this.nome = nome;
		        this.distanciaSol = distanciaSol;
		        this.numeroLuas = numeroLuas;
		    }

		    public void orbitar() {
		        System.out.println("Planeta orbitando o Sol.");
		    }

		    public void rotacionar() {
		        System.out.println("Planeta rotacionando.");
		    }

		    public void exibirInformacoes() {
		        System.out.println("Nome: " + nome + ", Distância do Sol: " + distanciaSol + " milhões de km, Luas: " + numeroLuas);
		    }
		}
	}

}
