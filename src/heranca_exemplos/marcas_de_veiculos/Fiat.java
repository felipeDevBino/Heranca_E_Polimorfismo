package heranca_exemplos.marcas_de_veiculos;

public class Fiat extends Base {

	public Fiat(String pNome, String pTipoDeVeiculo, int pKmPorLitro, int pVelocidade, int pValor) {
		nomeDaMarcaOriginal = "Fiat";
		criaVeiculo(nomeDaMarcaOriginal, pNome, pTipoDeVeiculo, pKmPorLitro, pVelocidade, pValor);
		enviaVeiculo();
	}

}
