
public class Aula05ContaBanco {
	//ATRIBUTOS
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	//MÉTODOS PERSONALIZADOS
	public void estadoAtual() {
		System.out.println("===================");
		System.out.println("Conta: "+this.getNumConta());
		System.out.println("Tipo: "+this.getTipo());
		System.out.println("Dono: "+this.getDono());
		System.out.println("Saldo: "+this.getSaldo());
		System.out.println("Status: "+this.getStatus());
		System.out.println("");
	}
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "cc") {
			this.setSaldo(50);
		} else {
			this.setSaldo(150);	
		}
		System.out.println("Conta aberta com sucesso..");
	}
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta com dinheiro..");
		}else if (this.getSaldo() < 0){
			System.out.println("Conta em debito..");
		}else {
			this.setStatus(false);
			System.out.println("Conta encerrada com sucesso..");
		}
	}
	public void depositar(float v) {
		if (this.getStatus() == true) {
				this.setSaldo(this.getSaldo() + v);
				System.out.println("Deposito realizado com sucesso na "+this.getTipo()+" do(a) usuario(a) "+this.getDono());
		} else {
			System.out.println("Impossivel depositar..");
		}
	}
	public void sacar(float v) {
		if (this.getStatus() == true) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado com sucesso da conta de "+this.getDono());
			}else {
				System.out.println("Saldo insuficiente...");
			}
		}else {
			System.out.println("Impossivel sacar de uma conta fechada...");
			}
		}
	public void pagarMensal() {
		int v;
		if (this.getTipo() == "cc") {
			v = 12;
		} else {
			v = 20;
		}
		if (this.getStatus() == true) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Mensalidade paga com sucesso..");
		} else {
			System.out.println("Impossivel pagar, a conta do(a) "+this.getDono()+" está encerrada");
		}
	}
	
	//CONSTRUTOR
	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	//MÉTODOS ESPECIAIS
	public void setDono(String d) {
		this.dono = d;
	}
	public String getDono() {
		return dono;
	}
	public void setSaldo(float s) {
		this.saldo = s;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setStatus(boolean s) {
		this.status = s;
	}
	public boolean getStatus() {
		return status;
	}
	public void setTipo(String t) {
		this.tipo = t;
	}
	public String getTipo() {
		return tipo;
	}
	public void setNumConta(int n) {
		this.numConta = n;
	}
	public int getNumConta() {
		return numConta;
	}
}
