package heranca_exemplos.marcas_de_veiculos;

public class Start {
	
	public static void main(String[] args) {
		
		Fiat uno = new Fiat();
		uno.esquematizaModelo("Fiat", "Uno Mile Fire", "Urbano", 2, 4);
		uno.getMateriais(2, 4);
		
		System.out.println();
		
		uno.distribuiVeiculos();
		
		System.out.println();
		
		uno.concessionariaFiat("Fiat");
		
		System.out.println();

		
		
		
	}

}
