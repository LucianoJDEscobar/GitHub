package CursoEmVideo;
public class Aula09 {
	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[1];
		Livro[] l = new Livro[2];
		p[0] = new Pessoa("Luciano", 30, "Mas");
//		p[1] = new Pessoa("Marcia", 34, "Fem");
		l[0] = new Livro("Java1", "Helena S. Dutra", 250, p[0]);
//		l[1] = new Livro("Java2", "Lara Dutra", 780, p[1]);
//		l[2] = new Livro("Java3", "Caua Dutra", 45, p[0]);
		
		System.out.println(l[0].detalhe());
		
	}
}
