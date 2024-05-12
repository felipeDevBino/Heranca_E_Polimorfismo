package heranca_exemplos.marcas_de_veiculos;

public class Chevrolet extends Base {

	public void concessionariaChevrolet() {
		StringBuilder marcaChevrolet = new StringBuilder();

		System.out.println("\nConcessionária Chevrolet");
		int posicao = 1;
		for (int i = (concessionarias.size() - 1); i >= 0; i--) {
			for (int j = 7; j <= 15; j++) {
				marcaChevrolet.append(concessionarias.get(i).charAt(j));
			}
			if (marcaChevrolet.toString().equals("Chevrolet")) {
				System.out.println("\n" + posicao + " - " + concessionarias.get(i));
				posicao++;
			}
			marcaChevrolet.delete(0, marcaChevrolet.length());
		}

	}

}
