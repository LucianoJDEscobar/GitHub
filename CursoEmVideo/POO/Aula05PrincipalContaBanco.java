
public class Aula05PrincipalContaBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBanco c1 = new ContaBanco();
		ContaBanco c2 = new ContaBanco();
		c1.setNumConta(101010);
		c1.setDono("Luciano Dutra");
		c1.abrirConta("cc");
		c2.setNumConta(225895);
		c2.setDono("Caua Dutra");
		c2.abrirConta("cp");
		c1.depositar(300);
		c2.depositar(500);
		c2.sacar(550);
		c2.sacar(100);
		c2.fecharConta();
		c2.depositar(50);
		c1.estadoAtual();
		c2.estadoAtual();
	}

}
