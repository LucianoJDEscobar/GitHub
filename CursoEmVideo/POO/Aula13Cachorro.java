package CursoEmVideo;
public class Aula13Cachorro extends Aula13Lobo  {
	@Override
	public void emitirSom() {
		System.out.println("Au! Au! Au!");
	}
	public void reagir(String a) {
		if (a == "Toma comida" || a == "Olá") {
			System.out.println("Abanando e latindo..");
		}else {
			System.out.println("Rosnando");
		}
	}
	public void reagir(int h, int m) {
		if (h < 12) {
			System.out.println("Abanando pela manhã..");
		}else if(h >= 18) {
			System.out.println("Ignoranado..");
		}else {
			System.out.println("Abanando pela tarde..");
		}
	}
	public void reagir(boolean a) {
		if (a) {
			System.out.println("Abanar para o dono");
		} else {
			System.out.println("Rosnar e latir para o estranho");
		}
	}
	public void reagir(int i, float p) {
		if (i < 5) {
			if (p < 10f) {
				System.out.println("Abanar");
			} else {
				System.out.println("Latir");
			}
		}else {
			if (p < 10) {
				System.out.println("Rosnar..");
			}else {
				System.out.println("Ignorar..");
			}
		}
	}
}
