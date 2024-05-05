package heranca_exemplos.dispositivos_eletronicos;

public class Start {

	public static void main(String[] args) {
		
		Notebook acer = new Notebook();
		acer.dispositivosEmQuestao("Acer", "Nitro 5");
		acer.defineEspecificacoes(15, 5);
		
		Notebook lenovo = new Notebook();
		lenovo.dispositivosEmQuestao("Lenovo", "Ideapad 3");
		lenovo.defineEspecificacoes(15.6, 6);
		
		acer.imprimeInformacoes();
		acer.retornaInformacoesIntegradas(false, true, false, false);
	
		System.out.println();
		
		lenovo.imprimeInformacoes();
		lenovo.retornaInformacoesIntegradas(true, true, true, true);
		
	}
	
}
