package heranca_exemplos.dispositivos_eletronicos;

public class Smartphone extends Base {

	private static boolean lanterna = false;
	
	public Smartphone(String marcaDoDispositivo, String nomeDoDispositivo, String alimentacao, double tamanhoDaTela,
			int duracaoDaBateria) {
		super(marcaDoDispositivo, nomeDoDispositivo, alimentacao, tamanhoDaTela, duracaoDaBateria);
		
	}
		
	public static void lanternaLigadaOuDesligada() {
		if(lanterna) {
			System.out.println("A lanterna estava ligada! Ela desligou agora.");
			lanterna = false;
		}else {
			System.out.println("A lanterna estava desligada! Ela ligou agora.");
			lanterna = true;
		}
	}
}
