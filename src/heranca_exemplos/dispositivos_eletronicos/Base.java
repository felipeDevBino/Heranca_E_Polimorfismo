package heranca_exemplos.dispositivos_eletronicos;

public class Base {

	protected String marcaDoDispositivo;
	protected String nomeDoDispositivo;
	protected double tamanhoDaTela;
	protected int duracaoDaBateria;

	public void dispositivosEmQuestao(String marcaDoDispositivo, String nomeDoDispositivo) {
		this.marcaDoDispositivo = marcaDoDispositivo;
		this.nomeDoDispositivo = nomeDoDispositivo;
	}

	public void defineEspecificacoes(double tamanhoDaTela, int duracaoDaBateria) {
		this.tamanhoDaTela = tamanhoDaTela;
		this.duracaoDaBateria = duracaoDaBateria;
	}

	public void imprimeInformacoes() {
		System.out.println("O dispositivo " + this.nomeDoDispositivo + " da " + this.marcaDoDispositivo
				+ " possui um tamanho de aproximadamente " + this.tamanhoDaTela + " polegadas."
				+ "\nO dispositivo conta com uma duração de bateria de aproximadamente " + this.duracaoDaBateria
				+ " horas.");
	}

}
