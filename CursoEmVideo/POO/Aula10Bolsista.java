package CursoEmVideo;
public class Aula10Bolsista extends Aula10Aluno{
	private int bolsa;
	public void renovarBolsa() {
		System.out.println("Renovando a bolsa de estudos..");
	}
	@Override
	public void pagarMensalidade() {
		System.out.println("Bolsista pagando a mensalidade");
	}
	public int getBolsa() {
		return bolsa;
	}
	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
	
}
