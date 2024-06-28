package br.com.felipepoo.heranca.arvoregenealogica;

import java.util.List;
import java.util.ArrayList;

public class Atual extends Passado {

	private List<String> herancaPerfeita;
	protected String caractrHerdadoAtual;

	public Atual(String nome, String personalidade, String caracteristicas, String doencas) {
		
		super(nome, personalidade, caracteristicas, doencas);
		
		herancaPerfeita = new ArrayList<>();
		caractrHerdadoAtual = randomizaCaracteristicaArvore();
		
		if (caractrAntepassado.equals(caractrHerdadoPassado) && caractrHerdadoPassado.equals(caractrHerdadoAtual)) {
			herancaPerfeita.add(textoHeranca());
		} else {
			herancaDeSeres.delete(0, herancaDeSeres.length());
		}
		
	}

	private String textoHeranca() {
		return "Herança perfeita da(s) característica(s): (" + caractrHerdadoAtual + ") entre as pessoas:\n"
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
	

}
