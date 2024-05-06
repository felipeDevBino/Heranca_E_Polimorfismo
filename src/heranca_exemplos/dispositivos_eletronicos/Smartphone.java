package heranca_exemplos.dispositivos_eletronicos;

public class Smartphone extends Base {

	public void retornaFuncoesEspeciais(boolean lanternaPorTremor, boolean reconhecimentoFacial,
			boolean reconhecimentoDeDigital, boolean iaIntegrada, boolean telaDobravel) {
		String ia = "";
		if (lanternaPorTremor || reconhecimentoFacial || reconhecimentoDeDigital || iaIntegrada || telaDobravel) {
			if (iaIntegrada) {
				System.out.println(
						"Digite qual IA através de seu número vêm integrada ao dispositivo " + nomeDoDispositivo);
				System.out.println("1 - Google Assistant");
				System.out.println("2 - Siri");
				System.out.println("3 - Bixby");
				System.out.println("4 - Alexa");

				int iaEscolhida = Integer.parseInt(Base.scanner.nextLine());

				if (iaEscolhida == 1) {
					ia = "Google Assistant";
				} else if (iaEscolhida == 2) {
					ia = "Siri";
				} else if (iaEscolhida == 3) {
					ia = "Bixby";
				} else if (iaEscolhida == 4) {
					ia = "Alexa";
				}
			}

			int quantidade = 1;

			if (lanternaPorTremor) {
				System.out.println(quantidade + " - Lanterna Ligada por Tremor");
				quantidade++;
			}
			if (reconhecimentoFacial) {
				System.out.println(quantidade + " - Reconhecimento Facial");
				quantidade++;
			}
			if (reconhecimentoDeDigital) {
				System.out.println(quantidade + " - Reconhecimento de Digital");
				quantidade++;
			}
			if (iaIntegrada) {
				System.out.println(quantidade + " - Inteligência Artificial Integrada: " + ia);
				quantidade++;
			}
			if (telaDobravel) {
				System.out.println(quantidade + " - Tela Dobrável");
			}

			quantidade = 0;

		} else {
			System.out.println("O dispositivo " + nomeDoDispositivo + " não possui funções especiais integradas!");
		}

	}

}
