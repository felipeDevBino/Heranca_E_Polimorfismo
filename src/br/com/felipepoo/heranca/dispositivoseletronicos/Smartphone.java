package br.com.felipepoo.heranca.dispositivoseletronicos;

public class Smartphone extends Dispositivo {

	/**
	 * TODO FELIPE - perguntar sobre inicialização de atributos no Java
	 * Não há necessidade de iniciar um tipo primitivo como false
	 */
	private boolean lanterna;
	
	public Smartphone(String marcaDispositivo, String nomeDispositivo, 
			String alimentacao, double tamanhoTela, int duracaoBateria) {
		
		super(marcaDispositivo, nomeDispositivo, alimentacao, tamanhoTela, duracaoBateria);
		
	}
	
	@Override
	public void ativaMetodoEspecial() {
		lanternaLigadaOuDesligada();
	}
	
	/**
	 * TODO FELIPE - perguntar sobre método lanternaLigadaOuDesligada 
	 * Oportunidade para conversar sobre modificadores de acesso na herança 
	 * Quando falamos de herança, podemos ter métodos representando comportamentos 
	 * padrões de objetos específicos, e pode acontecer de precisarmos que esses comportamentos 
	 * sejam específicos somente para esse objeto, então podemos mantê-los privados
	 */
	private void lanternaLigadaOuDesligada() {
		
		if(lanterna) {
			System.out.println("A lanterna estava ligada! Ela desligou agora.");
			lanterna = false;
		}else {
			System.out.println("A lanterna estava desligada! Ela ligou agora.");
			lanterna = true;
		}
		
	}
	
}
