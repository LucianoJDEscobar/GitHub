package CursoEmVideo;

public class Aula08Lutador {
	//ATRIBUTOS
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	//MÉTODO CONSTRUTOR
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas,
			int empates) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	//MÉTODOS PUBLICOS
	public void apresentar() {
		System.out.println("Na categoria "+this.getCategoria()+" apresentamos o..");
		System.out.println("LUTADOR: "+this.getNome());
		System.out.println("ORIGEM: "+this.getNacionalidade());
		System.out.println(this.getIdade()+" ANOS");
		System.out.println(this.getAltura()+" METROS");
		System.out.println("PESANDO "+this.getPeso()+" kg");
		System.out.println("GANHOU: "+this.getVitorias());
		System.out.println("PERDEU: "+this.getDerrotas());
		System.out.println("EMPATOU: "+this.getEmpates());
	}
	public void status() {
		System.out.println("");
		System.out.println("====================================");
		System.out.println(this.getNome()+" agora possui..");
		System.out.println("VITORIA - "+this.getVitorias());
		System.out.println("DERROTA - "+this.getDerrotas());
		System.out.println("EMPATE - "+this.getEmpates());
	}
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	};
	//MÉTODOS ESPECIAIS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if (this.peso < 52.2) {
			this.categoria = "Invalido";
		}else if (this.peso <= 70.3) {
			this.categoria = "Leve";
		}else if (this.peso <= 83.9) {
			this.categoria = "Medio";
		}else if (this.peso <= 120.2) {
			this.categoria = "Pesado";
		}else {
			this.categoria = "Invalido";
		}
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
}