package heranca_exemplos.dispositivos_eletronicos;

public class Notebook extends Base {

	private static String alimentacao;

	public Notebook(String marcaDoDispositivo, String nomeDoDispositivo, String pAlimentacao, double tamanhoDaTela,
			int duracaoDaBateria) {
		super(marcaDoDispositivo, nomeDoDispositivo, pAlimentacao, tamanhoDaTela, duracaoDaBateria);
		alimentacao = pAlimentacao;

	}

	public static void modos() {
		if (alimentacao.equals("cabo")) {
			System.out.println("\nO notebook está conectado ao cabo de energia!");
		}else if(alimentacao.equals("suspenso") || alimentacao.equals("sem cabo")) {
			System.out.println("\nO notebook não está conectado ao cabo de energia!");
		}
	}

}
