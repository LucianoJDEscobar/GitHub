
public class Aula02PrincipalCaneta {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "Bic";
		c1.cor = "azul";
		c1.ponta = 0.5f;
		//c1.tampada = false;
		c1.destampar();
		c1.status();
		c1.rabiscar();
	
		Caneta c2 = new Caneta();
		c2.modelo = "Hostnet";
		c2.cor = "Verde";
		c2.ponta = 1.1f;
		//c2.tampada = true;
		c2.tampar();
		c2.status();
		c2.rabiscar();
	}

}
