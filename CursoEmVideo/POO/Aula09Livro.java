package CursoEmVideo;

public class Aula09Livro implements Publicacao {
	//ATRIBUTOS
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	//MÉTODOS PERSONALIZADOS
	public String detalhe() {
		return "Livro \nTitulo = " + titulo + "\nAutor = " + autor + "\nTotPaginas = " + totPaginas + "\nPag. atual = " + pagAtual
				+ "\nAberto = " + aberto + "\nLeitor = " + leitor.getNome();
	}
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}
	//MÉTODOS ESPECIAIS
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotPaginas() {
		return totPaginas;
	}
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public boolean getAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	@Override
	public void abrir() {
		this.setAberto(true);
	}
	@Override
	public void fechar() {
		this.setAberto(false);
	}
	@Override
	public void folhear(int p) {
		this.pagAtual = p;
	}
	@Override
	public void avancarPag() {
		this.pagAtual++;
	}
	@Override
	public void voltarPag() {
		this.pagAtual--;
	}
}
