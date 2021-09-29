package CursoEmVideo;
public abstract class Aula13Animal {
	protected float peso;
	protected int idade;
	protected int menbros;
	public abstract void emitirSom();
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getMenbros() {
		return menbros;
	}
	public void setMenbros(int menbros) {
		this.menbros = menbros;
	}
}
