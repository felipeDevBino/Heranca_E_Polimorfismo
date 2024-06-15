package heranca_exemplos.arvore_genealogica;

public class Antepassado {

	protected StringBuilder ser = new StringBuilder();
	protected static StringBuilder herancaDeSeres = new StringBuilder();
	private static int qtdCaracteristicas = 0;
	protected static String[] caracteristicasHeranca;
	protected static String caractrAntepassado;
	protected static String nome;
	protected String caracteristicas;
	protected String raiz = "Antepassado";
	
	public Antepassado(String pNome, String personalidade, String pCaracteristicas) {
		nome = pNome;
		setRaiz(raiz);
		salvaCaracteristicas(pCaracteristicas);
		herancaDeSeres.append(pNome+"\n");
		
		ser = new StringBuilder();
		ser.append(raiz + ": " + nome).append("\nPersonalidade: " + personalidade)
				.append("\nCaracteristicas: " + caracteristicas + "\n");
	}


	public void setRaiz(String pRaiz) {
		raiz = pRaiz;
	}

	public void setCaracteristicas(String pCaracteristicas) {
		caracteristicas = pCaracteristicas;
		caractrAntepassado = pCaracteristicas;
	}

	public void getSer() {
		System.out.println(ser.toString());
	}

	public void getCaracteristicas() {
		int contador = 1;
		for (String caracteristica : caracteristicasHeranca) {
			System.out.println(contador + " característica: " + caracteristica);
			contador++;
		}
	}

	private void incrementaCaracteristicas() {
		if (caracteristicasHeranca == null) {
			caracteristicasHeranca = new String[qtdCaracteristicas];
		}
		
		String[] novoArray = new String[qtdCaracteristicas];
		for (int i = 0; i < caracteristicasHeranca.length; i++) {
			novoArray[i] = caracteristicasHeranca[i];
		}
		caracteristicasHeranca = novoArray;
		
	}

	public void salvaCaracteristicas(String pCaracteristicas) {
		qtdCaracteristicas++;
		incrementaCaracteristicas();
		caracteristicasHeranca[qtdCaracteristicas - 1] = pCaracteristicas;

		setCaracteristicas(pCaracteristicas);

	}

	@Override
	public String toString() {
		return ser.toString();
	}

}
