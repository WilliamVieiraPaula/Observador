
public class Main {

	public static void main(String[] args) {

		Gerador g = new Gerador();
		
		
		Observadores o = new Observadores();
		
		
		g.addObservador(o);
		
		g.adicionaNumero();
		
	}

}
