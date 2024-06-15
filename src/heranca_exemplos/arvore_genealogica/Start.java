package heranca_exemplos.arvore_genealogica;

public class Start {

	public static void main(String[] args) {

		Antepassado antepassado = new Antepassado("Alberto", "calmo", "seguro");
		
		antepassado.getSer();
		
		Passado passado = new Passado("Juliano", "bravo", "irritado impaciente", "gastrite");
		
		passado.getSer();

		Atual atual = new Atual("Emerson", "pacífico", "cabelo longo, cabelo preto", "asmático");
		
		atual.getSer();
	
		atual.getHerancasPerfeitas();
		
	}

}
