package polimorfismo_exemplos.bebidas;

public class Start {

	public static void main(String[] args) {

		Bebida cafe = new Cafe();
		Bebida limonada = new Limonada();
		Bebida vinho = new Vinho();
		
		cafe.getBebida();
		limonada.getBebida();
		vinho.getBebida();

	}

}
