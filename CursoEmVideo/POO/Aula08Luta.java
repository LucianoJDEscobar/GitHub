package CursoEmVideo;

import java.util.Random;

public class Aula08Luta {
	//ATRIBUTOS
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	//MÉTODOS PUBLICOS
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria() == l2.getCategoria() && (l1 != l2)) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		} else {
			System.out.println("Impossivel marcar Luta..");
		}
	}
	public void lutar() {
		if (this.aprovada = true) {
			System.out.println("##### DESAFIADO ######");
			this.desafiado.apresentar();
			System.out.println("#### DESAFIANTE #####");
			this.desafiante.apresentar();
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); //VAI GERAR TRÊS NUM. DE 0 A 2 ALEATÓRIOS
			switch(vencedor) {
				case 0:
					System.out.println("Empatou");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
					break;
				case 1:
					System.out.println(this.desafiado.getNome()+" Venceu!!");
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					break;
				case 2:
					System.out.println(this.desafiante.getNome()+" Venceu!!");
					this.desafiado.perderLuta();
					this.desafiante.ganharLuta();
					break;
			}
		}else {
			System.out.println("Esta luta nao pode acontecer..");
		}
	}
	//MÉTODOS ESPECIAIS
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean getAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
}
