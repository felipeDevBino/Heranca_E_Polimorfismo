package heranca_exemplos.marcas_de_veiculos;

public class Start {

	public static void main(String[] args) {

		Fiat uno = new Fiat("Uno", "Urbano", 15, 120, 15000);
		Volkswagen gol = new Volkswagen("Gol", "Urbano", 16, 150, 23000);
		Chevrolet chevette = new Chevrolet("Chevette", "Urbano", 18, 150, 20000);
		
		uno.concessionaria();
		gol.concessionaria();
		chevette.concessionaria();

	}

}
