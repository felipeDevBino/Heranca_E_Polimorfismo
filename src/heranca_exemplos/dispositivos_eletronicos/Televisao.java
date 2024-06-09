package heranca_exemplos.dispositivos_eletronicos;

import java.util.Random;

public class Televisao extends Base {

	public Televisao(String marcaDoDispositivo, String nomeDoDispositivo, String alimentacao, double tamanhoDaTela,
			int duracaoDaBateria) {
		super(marcaDoDispositivo, nomeDoDispositivo, alimentacao, tamanhoDaTela, duracaoDaBateria);
		
	}
	
	public static void canais() {
		Random random = new Random();
		int instrucao = (2 * (random.nextInt(6) + 1));
		int randomizaCanal = random.nextInt(instrucao) + 1;
		System.out.println("A televisão está sintonizada no canal: " + randomizaCanal);
	}

}
