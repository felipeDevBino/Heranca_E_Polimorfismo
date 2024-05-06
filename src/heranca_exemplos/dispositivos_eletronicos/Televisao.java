package heranca_exemplos.dispositivos_eletronicos;

public class Televisao extends Base {

	public void retornaAspectosProprios(boolean inclinavel, boolean tecnologiaDePainel, boolean smartTv,
			boolean tecnologiasDeRede, boolean fixada) {
		String resolucao = "";
		String tecnologiaDeImagem = "";
		StringBuilder redesEscolhidas = null;
		String nivel;

		if (inclinavel || tecnologiaDePainel || smartTv || tecnologiasDeRede || fixada) {

			System.out.println("Selecione uma das opções seguintes que definem o nível de resolução da TV:");
			System.out.println("1 - SD");
			System.out.println("2 - HD");
			System.out.println("3- FULL HD");
			System.out.println("4 - ULTRA HD");

			int resolucaoEscolhida = Integer.parseInt(Base.scanner.nextLine());

			if (resolucaoEscolhida == 1) {
				resolucao = "480p";
			} else if (resolucaoEscolhida == 2) {
				resolucao = "720p";
			} else if (resolucaoEscolhida == 3) {
				resolucao = "1080p";
			} else if (resolucaoEscolhida == 4) {
				do {
					System.out.println("Qual é o nível de resolução da sua TV Ultra HD (4k / 8K)?");
					nivel = scanner.nextLine();
					if (!nivel.equals("4k") && !nivel.equals("8k")) {
						System.out.println("Erro, nível de resolução inválido!");
					}
				} while (!nivel.equals("4k") && !nivel.equals("8k"));
			}

			if (tecnologiaDePainel) {

				System.out.println("Selecione o tipo de tecnologia de painel especial que sua televisão possui:");
				System.out.println("1 - OLED");
				System.out.println("2 - QLED");
				System.out.println("3 - LED");
				System.out.println("4 - LCD");

				int tecnologia = Integer.parseInt(Base.scanner.nextLine());

				if (tecnologia == 1) {
					tecnologiaDeImagem = "OLED";
				} else if (tecnologia == 2) {
					tecnologiaDeImagem = "QLED";
				} else if (tecnologia == 3) {
					tecnologiaDeImagem = "LED";
				} else if (tecnologia == 4) {
					tecnologiaDeImagem = "LCD";
				}

			}
			if (tecnologiasDeRede) {
				int selecionaRede = 1;
				redesEscolhidas = new StringBuilder();
				System.out.println(
						"Selecione os tipos de rede que compõem a conectividade do seu aparelho televisor (Digite 0 quando terminar):");
				do {
					System.out.println("1 - WIFI");
					System.out.println("2 - Bluetooth");
					System.out.println("3 - Porta Ethernet");
					System.out.println("4 - Portas USB");
					System.out.println("5 - Entrada de Antena");

					int redes = Integer.parseInt(Base.scanner.nextLine());
					selecionaRede = redes;
					if (redes == 1) {
						redesEscolhidas.append("\nWIFI");
						smartTv = true;
					} else if (redes == 2) {
						redesEscolhidas.append("\nBluetooth");
					} else if (redes == 3) {
						redesEscolhidas.append("\nPorta Ethernet");
						smartTv = true;
					} else if (redes == 4) {
						redesEscolhidas.append("\nPortas USB");
					} else if (redes == 5) {
						redesEscolhidas.append("\nEntrada de Antena");
					}

				} while (selecionaRede != 0);

			}

			int quantidade = 1;

			System.out.println("\n");

			System.out.println(quantidade + " - Resolução: " + resolucao);
			quantidade++;
			if (inclinavel) {
				System.out.println(quantidade + " - Televisão Inclinável");
				quantidade++;
			}
			if (tecnologiaDePainel) {
				System.out.println(quantidade + " - Tecnologia de Painel: " + tecnologiaDeImagem);
				quantidade++;
			}
			if (smartTv) {
				System.out.println(quantidade + " - TV Inteligente (Smart TV)");
				quantidade++;
			}
			if (fixada) {
				System.out.println(quantidade + " - Televisão Fixa");
				quantidade++;
			}
			if (tecnologiasDeRede) {
				System.out.println(quantidade + " - Tecnologias de Rede:\n" + redesEscolhidas.toString());
				quantidade++;
			}

			quantidade = 0;

		} else {
			System.out.println("O dispositivo televisor " + nomeDoDispositivo + " é uma TV de tubo.");
		}

	}

}
