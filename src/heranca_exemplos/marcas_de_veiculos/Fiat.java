package heranca_exemplos.marcas_de_veiculos;

public class Fiat extends Base {

	public void preDefinicoesFiat() {

	}

	public void concessionariaFiat(String marca) {
		int posicao = 1;
		if (concessionarias.keySet() != null) {
			System.out.println("Concessionária Fiat");
			for (String veiculo : concessionarias.keySet()) {
				if (veiculo == marca) {
					System.out.println(posicao + " - " + concessionarias.get(veiculo));
					posicao++;
				}
			}
		}

	}

}
