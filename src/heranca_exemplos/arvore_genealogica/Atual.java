package heranca_exemplos.arvore_genealogica;

import java.util.List;
import java.util.ArrayList;

public class Atual extends Passado {

	private List<String> herancaPerfeita = new ArrayList<>();
	protected static String caractrHerdadoAtual = randomizaCaracteristica();

	public Atual(String nome, String personalidade, String caracteristicas, String doencas) {
		super(nome, personalidade, caracteristicas, doencas);
		
		if (caractrAntepassado.equals(caractrHerdadoPassado) && caractrHerdadoPassado.equals(caractrHerdadoAtual)) {
			herancaPerfeita.add(textoHeranca());
		} else {
			herancaDeSeres.delete(0, herancaDeSeres.length());
		}
	}

	private String textoHeranca() {
		return "\nHerança perfeita da(s) característica(s): (" + caractrHerdadoAtual + ") entre as pessoas:\n"
				+ herancaDeSeres.toString();
	}

	public void getHerancasPerfeitas() {
		for (String heranca : herancaPerfeita) {
			System.out.println(heranca);
		}
	}

	@Override
	public void setRaiz(String raiz) {
		raiz = "Atual";
		super.setRaiz(raiz);
	}
	
	@Override
	public void setCaracteristicas(String pCaracteristicas) {
		caracteristicas = pCaracteristicas;
		caractr = randomizaCaracteristica();
		caractrHerdadoAtual = caractr;
	}

}
