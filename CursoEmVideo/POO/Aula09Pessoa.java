package CursoEmVideo;

public class Aula09Pessoa {
	//ATRIBUTOS
	private String nome;
	private int idade;
	private String sexo;
	//M�TODOS PERSONALIZADOS
	public void fazerAniver() {
		this.setIdade(this.getIdade()+1);
		System.out.println("Idade: "+this.getIdade());
	}
	//CONSTRUTOR PADR�O
	public Pessoa (String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	//M�TODOS ESPECIAIS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
}
