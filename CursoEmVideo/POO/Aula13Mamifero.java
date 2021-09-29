package CursoEmVideo;
public class Aula13Mamifero extends Aula13Animal {
	protected String corPelo;
	@Override
	public void emitirSom() {
		System.out.println("Som de mamífero..");
	}
	public String getCorPelo() {
		return corPelo;
	}
	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
}
