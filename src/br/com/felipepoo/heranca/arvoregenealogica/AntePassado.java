package br.com.felipepoo.heranca.arvoregenealogica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class AntePassado {

	protected StringBuilder herancaDeSeres;
	
	protected List<AntePassado> arvore;
	
	protected String caractrAntepassado;
	protected String nome;
	protected String personalidade;
	
	protected String caracteristicas;
	protected String doencas;

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

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}
	
	public void mostrarSer() {
		
		StringBuilder msg = new StringBuilder();
		
		//compila características comuns a todos
		msg.append("Nome: ").append(this.nome).append("\n");
		msg.append("Personalidade: ").append(this.personalidade).append("\n");
		msg.append("Características: ").append(this.caracteristicas.replace(";", ", ")).append("\n");
		
		//compila características herdadas
		String caracHerdadas = randomizaCaracteristicaArvore();
		
		if( !caracHerdadas.isEmpty() ) {
			msg.append("Caracteristicas Herdadas: ").append( randomizaCaracteristicaArvore() ).append("\n");
		}
		
		String hereditariedade = getHerancaPerfeita();
		
		if( !hereditariedade.isEmpty() ) {
			msg.append("Hereditariedade Confirmada:").append(hereditariedade).append("\n");
		}
		
		//compila doenças
		if( !this.doencas.isEmpty() ) {
			msg.append("Doenças: ").append(this.doencas).append("\n");
		}
		
		System.out.println(msg.toString());
		System.out.println("__________________________________________________");
		
	}

	public void setCaracteristicasHerdadas(AntePassado antePassado) {
		this.caractrAntepassado = antePassado.getCaracteristicas();
	}
	
	public void addAntePassado(AntePassado antePassado) {
		arvore.add(antePassado);
	}
	
	protected String randomizaCaracteristicaArvore() {
		
		//agrupa todas as características da arvore genealógica
		List<String> caracGeral = new ArrayList<>();
		
		for(AntePassado a : arvore) {
			caracGeral.addAll( Arrays.asList( a.getCaracteristicas().split(";") ) );
		}
		
		//só continua se existirem características
		if( caracGeral.isEmpty() ) {
			return "";
		}
		
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		
		//sorteia a quantidade de características que serão herdadas
		//e quais serão herdadas
		int totalHerancas = random.nextInt(0, caracGeral.size());
		
		for(int i=0; i<totalHerancas; i++) {
			int indiceCaracSorteada = random.nextInt(0, caracGeral.size());
			String caracHerdada = caracGeral.get(indiceCaracSorteada);
			sb.append(caracHerdada).append(" ");
		}
		
		return sb.toString();
		
	}
	
	public String getHerancaPerfeita() {
		
		StringBuilder sbCarac = new StringBuilder();
		
		List<String> caracList = new ArrayList<>();
		
		for(AntePassado a : arvore) {
			String[] caracSer = a.getCaracteristicas().split(";");
			caracList.addAll(Arrays.asList(caracSer));
		}
		
		for(int i=0; i<caracList.size(); i++) {
			
			int contagemCaracArvore = 0;
			
			for(int j=0; j<caracList.size(); j++) {
				if( caracList.get(i).equals( caracList.get(j) ) ) {
					contagemCaracArvore++;
				}
			}
			
			if( contagemCaracArvore == arvore.size() ) {
				sbCarac.append(caracList.get(i));
			}
			
		}
		
		return sbCarac.toString();
		
	}

	
}
