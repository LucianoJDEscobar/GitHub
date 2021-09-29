package CursoEmVideo;
public class Aula12Ave extends Aula12Animal {
	private String corPena;
	@Override
	public void locomover() {
		System.out.println("Voando.. ");
	}
	@Override
	public void alimentar() {
		
	}
	@Override
	public void emitirSom() {
		
	}
	public void fazerNinho() {
		System.out.println("Construiu um ninho.. ");
	}
	public String getCorPena() {
		return corPena;
	}
	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
}
