package heranca_exemplos.marcas_de_veiculos;

public class Volkswagen extends Base {

	public Volkswagen(String pNome, String pTipoDeVeiculo, int pKmPorLitro, int pVelocidade, int pValor) {
		nomeDaMarcaOriginal = "Volkswagen";
		criaVeiculo(nomeDaMarcaOriginal, pNome, pTipoDeVeiculo, pKmPorLitro, pVelocidade, pValor);
		enviaVeiculo();
	}

}
