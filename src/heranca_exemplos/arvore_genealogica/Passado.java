package heranca_exemplos.arvore_genealogica;

import java.util.Random;

public class Passado extends Antepassado {

	protected static String caractrHerdadoPassado;
	protected String caractr;
	
	public Passado(String nome, String personalidade, String caracteristicas, String doencas) {
		super(nome, personalidade, caracteristicas);
		
		ser.append("Doenças: " + doencas);
		ser.append("\nCaracterística herdada: " + caractr + "\n");
	}

	protected static String randomizaCaracteristica() {
		Random random = new Random();
		int randomizar = 0;
		randomizar = random.nextInt(caracteristicasHeranca.length);
		return caracteristicasHeranca[randomizar];
	}

	@Override
	public void setRaiz(String raiz) {
		raiz = "Passado";
		super.setRaiz(raiz);
	}
	
	@Override
	public void setCaracteristicas(String pCaracteristicas) {
		caracteristicas = pCaracteristicas;
		caractr = randomizaCaracteristica();
		caractrHerdadoPassado = caractr;
	}

}
