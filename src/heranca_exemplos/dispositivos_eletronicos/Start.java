package heranca_exemplos.dispositivos_eletronicos;

public class Start {

	public static void main(String[] args) {
		
		Notebook acer = new Notebook();
		acer.dispositivosEmQuestao("Acer", "Nitro 5");
		acer.defineEspecificacoes(15, 5);
			
		Smartphone samsung = new Smartphone();
		samsung.dispositivosEmQuestao("Samsung", "Galaxy S24");
		samsung.defineEspecificacoes(6.7, 8);
		
		System.out.println();
		
		samsung.imprimeInformacoes();
		samsung.retornaFuncoesEspeciais(true, true, true, true, false);
	
		Televisao lg = new Televisao();
		lg.dispositivosEmQuestao("LG", "Flatron");
		lg.defineEspecificacoes(25, 00);
		
		System.out.println();
		
		lg.imprimeInformacoes();
		lg.retornaAspectosProprios(true, true, true, true, true);
		
		Base.scanner.close();
		
	}
	
}
