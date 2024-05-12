package heranca_exemplos.marcas_de_veiculos;

public class Volkswagen extends Base {

	public void concessionariaVolkswagen() {
		StringBuilder marcaVolkswagen = new StringBuilder();

		System.out.println("\nConcessionária Volkswagen");
		int posicao = 1;
		for (int i = (concessionarias.size() - 1); i >= 0; i--) {
			for (int j = 7; j <= 16; j++) {
				marcaVolkswagen.append(concessionarias.get(i).charAt(j));
			}
			if (marcaVolkswagen.toString().equals("Volkswagen")) {
				System.out.println("\n" + posicao + " - " + concessionarias.get(i));
				posicao++;
			}
			marcaVolkswagen.delete(0, marcaVolkswagen.length());
		}

	}

}
