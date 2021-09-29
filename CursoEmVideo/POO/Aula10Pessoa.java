package CursoEmVideo;
public abstract class Aula10Pessoa {
	//ATRIBUTO
	private String tipo;
	private String nome;
	private int idade;
	private String sexo;
	//MÉTODOS PERSONALIZADOS
	public void fazerAniv() {
		this.idade ++;
	}
	//MÉTODOS ESPECIAIS
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
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "\nDADOS do "+tipo+"\nNome = " + nome + "\nIdade = " + idade + "\nSexo = " + sexo;
	}
	
}
