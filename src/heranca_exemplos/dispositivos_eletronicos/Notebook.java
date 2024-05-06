package heranca_exemplos.dispositivos_eletronicos;

public class Notebook extends Base {

	public void retornaInformacoesIntegradas(boolean tecladoDeMembrana, boolean tecladoMecanico, boolean tecladoRetroIluminado,
			boolean teclaDeClickNoTouch) {
		if (tecladoDeMembrana || tecladoMecanico || tecladoRetroIluminado || teclaDeClickNoTouch) {
			System.out.println("O Notebook " + nomeDoDispositivo + " da " + marcaDoDispositivo
					+ " possui os seguintes acessórios integrados: ");
			
			int quantidade = 1;
			
			if(tecladoDeMembrana) {
				System.out.println(quantidade + " - Teclado de Membrana");
				quantidade++;
			}
			if (tecladoMecanico) {
				System.out.println(quantidade + " - Teclado mecânico");
				quantidade++;
			} 
			if (tecladoRetroIluminado) {
				System.out.println(quantidade + " - Teclado retroiluminado");
				quantidade++;
			}
			if (teclaDeClickNoTouch) {
				System.out.println(quantidade + " - Tecla de click no touch integrado");
				quantidade++;
			}
			
			quantidade = 0;
			
		} else {
			System.out.println("O dispositivo " + nomeDoDispositivo + " não possui acessórios integrados!");
		}
	}

}
