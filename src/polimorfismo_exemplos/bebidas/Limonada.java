package polimorfismo_exemplos.bebidas;

public class Limonada extends Bebida {

	public Limonada() {
		nomeDaBebida = "Limonada";
		caracteristica = "Cítrica";
	}
	public String adocada() {
		System.out.println("Deseja adicionar adoçante na limonada?");
		String opcao = scanner.nextLine();
		if (opcao.equalsIgnoreCase("sim")) {
			return "A limonada é adocicada!";
		} else if (opcao.equalsIgnoreCase("não")) {
			return "A limonada não é adocicada!";
		} else {
			System.out.println("\nOpção inválida!");
		}
		return "indefinido";
	}

	@Override
	public String tipoDeBebida() {
		return "Natural";
	}

	@Override
	public String efeitoDaBebida() {
		return "Acidez estomacal";
	}

	@Override
	public String colateralDaBebida() {
		return "Desconforto estomacal";
	}

	@Override
	public void getBebida() {
		texto = String.format(
				"Nome da bebida: %s\nCaracterística: %s\nTipo de bebida: %s\nEfeito da bebida: %s\nColateral da bebida: %s\nStatus: %s\n",
				nomeDaBebida, caracteristica, tipoDeBebida(), efeitoDaBebida(), colateralDaBebida(), adocada());
		System.out.println(texto);
		
	}
	
}
