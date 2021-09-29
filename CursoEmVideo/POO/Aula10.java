package CursoEmVideo;
public class Aula10 {
	public static void main(String[] args) {
		//Pessoa p1 = new Pessoa();
		Visitante v1 = new Visitante();
		v1.setTipo("VISITANTE");
		v1.setNome("Luciano");
		v1.setIdade(34);
		v1.setSexo("M");
		System.out.println(v1.toString());
		Aluno a1 = new Aluno();
		a1.setTipo("ALUNO");
		a1.setNome("Joao");
		a1.setIdade(10);
		a1.setSexo("M");
		System.out.println(a1.toString());
		a1.pagarMensalidade();
		Bolsista b1 = new Bolsista();
		b1.setTipo("BOLSISTA");
		b1.setNome("Marcia");
		b1.setIdade(38);
		b1.setSexo("M");
		System.out.println(b1.toString());
		b1.renovarBolsa();
		b1.pagarMensalidade();
	}

}
