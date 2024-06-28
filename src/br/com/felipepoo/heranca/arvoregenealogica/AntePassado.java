package br.com.felipepoo.heranca.arvoregenealogica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class AntePassado {

	protected StringBuilder herancaDeSeres;
	protected String[] caracteristicasHeranca;
	
	protected List<AntePassado> arvore;
	
	protected String caractrAntepassado;
	protected String nome;
	protected String personalidade;
	
	protected String caracteristicas;
	protected String doencas;

	protected String raiz;
	
	public AntePassado(String nome, String personalidade, String caracteristicas) {
		
		this.nome = nome;
		this.personalidade = personalidade;
		this.doencas = "";
		
		this.caractrAntepassado = "";
		this.caracteristicas = caracteristicas;
		
		herancaDeSeres = new StringBuilder();
		
		herancaDeSeres.append(nome+"\n");
		
		arvore = new ArrayList<>();
		
	}

	public void setRaiz(String pRaiz) {
		raiz = pRaiz;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}
	
	public String getCaractrAntepassado() {
		return caractrAntepassado;
	}

	public void mostrarSer() {
		
		StringBuilder msg = new StringBuilder();
		
		msg.append("Nome: ").append(this.nome).append("\n");
		msg.append("Personalidade: ").append(this.personalidade).append("\n");
		msg.append("Características: ").append(this.caracteristicas.replace(";", ", ")).append("\n");
		
		String caracHerdadas = randomizaCaracteristicaArvore();
		
		if( !caracHerdadas.isEmpty() ) {
			msg.append("Caracteristicas Herdadas: ").append( randomizaCaracteristicaArvore() ).append("\n");
		}
		
		if( !this.doencas.isEmpty() ) {
			msg.append("Doenças: ").append(this.doencas).append("\n");
		}
		
		System.out.println(msg.toString());
		System.out.println("_________________________________________");
		
	}

	public void setCaracteristicasHerdadas(AntePassado antePassado) {
		this.caractrAntepassado = antePassado.getCaracteristicas();
	}
	
	public void addAntePassado(AntePassado antePassado) {
		arvore.add(antePassado);
	}
	
	protected String randomizaCaracteristicaArvore() {
		
		List<String> caracGeral = new ArrayList<>();
		
		for(AntePassado a : arvore) {
			caracGeral.addAll( Arrays.asList( a.getCaracteristicas().split(";") ) );
		}
		
		if( caracGeral.isEmpty() ) {
			return "";
		}
		
		Random random = new Random();
		int randomizar = random.nextInt(0, caracGeral.size());
		
		return caracGeral.get(randomizar); 
		
	}

	
}
