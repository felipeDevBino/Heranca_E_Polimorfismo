package polimorfismo_exemplos.bebidas;

public class Vinho extends Bebida {

	public Vinho() {
		nomeDaBebida = "Vinho";
		caracteristica = "Forte e doce";
	}

	@Override
	public String tipoDeBebida() {
		return "Alcoólica";
	}

	@Override
	public String efeitoDaBebida() {
		return "Ficar alcoolizado";
	}

	@Override
	public String colateralDaBebida() {
		return "Problemas emocionais e físicos";
	}

	public String tipoDeVinho() {
		System.out.println("\nSelecione o tipo de vinho: (1 - seco / 2 - suave / 3 - fortificado / 4 - outro)");
		int tipo = Integer.parseInt(scanner.nextLine());
		if (tipo == 1) {
			return "Seco";
		} else if (tipo == 2) {
			return "Suave";
		} else if (tipo == 3) {
			return "Fortificado";
		} else if (tipo == 4) {
			System.out.println("\nDigite o tipo de vinho: ");
			String tipoDeVinho = scanner.nextLine();
			return tipoDeVinho;
		}
		return "indefinido";
	}

	@Override
	public void getBebida() {
		texto = String.format(
				"Nome da bebida: %s\nCaracterística: %s\nTipo de bebida: %s\nEfeito da bebida: %s\nColateral da bebida: %s\nTipo de vinho: %s\n",
				nomeDaBebida, caracteristica, tipoDeBebida(), efeitoDaBebida(), colateralDaBebida(), tipoDeVinho());
		System.out.println(texto);
	}

}
