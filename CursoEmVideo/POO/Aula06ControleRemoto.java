package CursoEmVideo;

public class Aula06ControleRemoto implements Aula06Controlador{
	//ATRIBUTOS
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//MÉTODOS ESPECIAIS
	public ControleRemoto() {
		volume = 50;
		ligado = false;
		tocando = false;
	}
	private void setVolume(int v) {
		this.volume = v;
	}
	private int getVolume() {
		return volume;
	}
	private void setLigado(boolean l) {
		this.ligado = l;
	}
	private boolean getLigado() {
		return ligado;
	}
	private void setTocando(boolean t) {
		this.tocando = t;
	}
	private boolean getTocando() {
		return tocando;
	}
	@Override
	public void ligar() {
		this.setLigado(true);
	}
	@Override
	public void desligar() {
		this.setLigado(false);
	}
	@Override
	public void fecharMenu() {
		System.out.println("Fechando o menu..");
	}
	@Override
	public void maisVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() + 5);
		} else {
			System.out.println("TV desligada!");
		}
	}
	@Override
	public void menosVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() - 5);
		} else {
			System.out.println("TV desligada!");
		}
	}
	@Override
	public void ligarMudo() {
		if (this.getLigado()) {
			if (this.getVolume() > 0) {
				this.setVolume(0);
				System.out.println("MUDO");
			}
		} else {
			System.out.println("MUDO");
		}
	}
	@Override
	public void desligarMudo() {
		if (this.getLigado()) {
			if (this.getVolume() == 0) {
				this.setVolume(50);
			}
		} else {
			System.out.println("A TV nao esta no MUDO...");
		}
	}
	@Override
	public void play() {
		if (this.getLigado()) {
			if(this.getTocando() == false) {
				System.out.println("Reproduzindo midia..");
				this.setTocando(true);
			}
		}
/*		if (this.getTocando() && !(this.getLigado())) {
			this.setTocando(true);
		}	
*/	}
	@Override
	public void pause() {
		if (this.getLigado()) {
			if(this.getTocando() == false) {
				System.out.println("Reproduzindo midia..");
				this.setTocando(true);
			}
		}
	} 
	@Override
	public void abrirMenu() {
		System.out.println("O equipamento esta ligado? "+this.getLigado());
		System.out.println("Esta tocando?"+this.getTocando());
		System.out.println("Volume em "+this.getVolume()+"%");
		for (int i = 0 ; i <= this.getVolume() ; i += 10) {
			System.out.print("|  ");
		}
	}
}