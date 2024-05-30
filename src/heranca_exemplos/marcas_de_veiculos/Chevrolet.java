package heranca_exemplos.marcas_de_veiculos;

public class Chevrolet extends Base {

	public Chevrolet(String pNome, String pTipoDeVeiculo, int pKmPorLitro, int pVelocidade, int pValor) {
		nomeDaMarcaOriginal = "Chevrolet";
		criaVeiculo(nomeDaMarcaOriginal, pNome, pTipoDeVeiculo, pKmPorLitro, pVelocidade, pValor);
		enviaVeiculo();
	}

}
