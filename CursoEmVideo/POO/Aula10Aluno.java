package CursoEmVideo;
public class Aula10Aluno extends Aula10Pessoa {
	//ATRIBUTOS
	private int matricula;
	private String curso;
	//M�TODOS PERSONALIZADO
	
	public void pagarMensalidade() {
		System.out.println("Pagando a mensalidade de aluno..");;
	}
	//M�TODOS ESPECIAIS
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
