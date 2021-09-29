package CursoEmVideo;

public class Aula12Canguru extends Aula12Mamifero {
	public void usarBolsa() {
		System.out.println("Utilizando a bolsa..");
	}
	@Override
	public void locomover() {
		System.out.println("Pulando..");
		super.locomover();
	}
	
}
