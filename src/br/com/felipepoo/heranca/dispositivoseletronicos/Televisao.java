package br.com.felipepoo.heranca.dispositivoseletronicos;

import java.util.Random;

public class Televisao extends Dispositivo {

	public Televisao(String marcaDispositivo, String nomeDispositivo, String alimentacao, 
			double tamanhoTela, int duracaoBateria) {
		
		super(marcaDispositivo, nomeDispositivo, alimentacao, tamanhoTela, duracaoBateria);
		
	}
	
	@Override
	public void ativaMetodoEspecial() {
		canais();
	}
	
	public void canais() {
		
		Random random = new Random();
		
		int instrucao = (2 * (random.nextInt(6) + 1));
		int randomizaCanal = random.nextInt(instrucao) + 1;
		
		System.out.println("A televisão está sintonizada no canal: " + randomizaCanal);
		
	}

}
