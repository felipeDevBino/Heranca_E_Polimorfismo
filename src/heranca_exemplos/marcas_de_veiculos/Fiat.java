package heranca_exemplos.marcas_de_veiculos;

public class Fiat extends Base {

	public void concessionariaFiat() {
		StringBuilder marcaFiat = new StringBuilder();

		System.out.println("\nConcessionária Fiat");
		int posicao = 1;
		for (int i = (concessionarias.size() - 1); i >= 0; i--) {
			for (int j = 7; j <= 10; j++) {
				marcaFiat.append(concessionarias.get(i).charAt(j));
			}
			if (marcaFiat.toString().equals("Fiat")) {
				System.out.println("\n" + posicao + " - " + concessionarias.get(i));
				posicao++;
			}
			marcaFiat.delete(0, marcaFiat.length());
		}

	}

}
