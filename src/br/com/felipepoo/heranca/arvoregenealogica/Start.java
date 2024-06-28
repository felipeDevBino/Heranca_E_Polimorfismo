package br.com.felipepoo.heranca.arvoregenealogica;

public class Start {

	public static void main(String[] args) {

		//criando gerações
		AntePassado avo = new AntePassado("Alberto", "calmo", "seguro; pacifico; sábio");
		Passado filho = new Passado("Juliano", "bravo", "irritado; impaciente; reclamão", "gastrite");
		Atual neto = new Atual("Emerson", "pacífico", "cabelo longo; cabelo preto; caspas; mentalidade de macaco", "asmático");
		
		//adicionando caracteristicas
		filho.setCaracteristicasHerdadas(avo);
		neto.setCaracteristicasHerdadas(filho);
		
		//adicionando gerações
		filho.addAntePassado(avo);

		neto.addAntePassado(avo);
		neto.addAntePassado(filho);
		
		//exibindo caracteristicas
		avo.mostrarSer();
		filho.mostrarSer();
		neto.mostrarSer();
	
	}

}
