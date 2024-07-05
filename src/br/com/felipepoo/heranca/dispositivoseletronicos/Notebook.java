package br.com.felipepoo.heranca.dispositivoseletronicos;

public class Notebook extends Dispositivo {

	private String alimentacao;

	public Notebook(String marcaDispositivo, String nomeDispositivo, String alimentacao, 
			double tamanhoTela, int duracaoBateria) {
		
		super(marcaDispositivo, nomeDispositivo, alimentacao, tamanhoTela, duracaoBateria);
		
		this.alimentacao = alimentacao;

	}

	@Override
	public void ativaMetodoEspecial() {
		modos();
	}
	
	/**
	 * TODO FELIPE - perguntar sobre método modos 
	 * Oportunidade para conversar sobre modificadores de acesso na herança 
	 * Quando falamos de herança, podemos ter métodos representando comportamentos 
	 * padrões de objetos específicos, e pode acontecer de precisarmos que esses comportamentos 
	 * sejam específicos somente para esse objeto, então podemos mantê-los privados
	 */
	private void modos() {
		
		if (alimentacao.equals("cabo")) {
			System.out.println("\nO notebook está conectado ao cabo de energia!");
		}else if(alimentacao.equals("suspenso") || alimentacao.equals("sem cabo")) {
			System.out.println("\nO notebook não está conectado ao cabo de energia!");
		}
		
	}

}
