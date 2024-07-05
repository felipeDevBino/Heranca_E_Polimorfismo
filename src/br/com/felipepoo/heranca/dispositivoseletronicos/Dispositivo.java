package br.com.felipepoo.heranca.dispositivoseletronicos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * TODO FELIPE - Perguntar sobre classes abstratas 
 * Oportunidade para falar sobre o assunto
 */
public abstract class Dispositivo {

	public Scanner scanner;
	protected Map<String, Dispositivo> mapDispositivos;
	protected List<String> nomes, chaves;
	
	/**
	 * TODO FELIPE - Oportunidade para perguntar sobre como refatotorar variaveis e atributos de maneira mais rapida,
	 *  porque alguns atributos abaixo foram alterados
	 */
	protected String marcaDispositivo, nomeDispositivo, alimentacao;
	
	protected double tamanhoTela;
	protected int duracaoBateria;

	public Dispositivo(String marcaDispositivo, String nomeDispositivo, 
			String alimentacao, double tamanhoTela, int duracaoBateria) {
		
		//TODO FELIPE - perguntar sobre conceito de "contexto static X contexto no-static"
		scanner = new Scanner(System.in);
		mapDispositivos = new HashMap<>();
		nomes = new ArrayList<>();
		chaves = new ArrayList<>();
		
		this.marcaDispositivo = marcaDispositivo;
		this.nomeDispositivo = nomeDispositivo;
		this.alimentacao = alimentacao;
		this.tamanhoTela = tamanhoTela;
		this.duracaoBateria = duracaoBateria;
		
		nomes.add(nomeDispositivo);
		mapDispositivos.put(nomeDispositivo, this);
		
	}
	
	/**
	 * TODO FELIPE - Perguntar sobre classes abstratas e como 
	 * podemos usá-las nas heranças
	 */
	public abstract void ativaMetodoEspecial();

	/**
	 * TODO FELIPE - Perguntar sobre formas de ver se um recurso está sendo usado por outras classes.
	 * Nesse ponto podemos remover esse método, mas quero te falar como descobri isso.
	 */
//	protected String getNomeDaClasse() {
//		return this.getClass().getName();
//	}
	
	private String identificaDispositivo(Object dispositivo) {
		
		//TODO FELIPE - Perguntar sobre conceito de "if guardião"
		//ou trabalhar uma variável
		
		String identificador = "";
		
		if (dispositivo instanceof Notebook) {
			identificador = "N";
		} else if (dispositivo instanceof Smartphone) {
			identificador = "S";
		} else if (dispositivo instanceof Televisao) {
			identificador = "T";
		}
		
		return identificador;
		
	}

	/**
	 * TODO FELIPE - Perguntar sobre operador lógico E, 
	 * sobre conceito de curto circuito em programação
	 * Aproveitar para analisar se realmente precisa do parametro nomeDispositivo
	 * @param nomeDispositivo
	 */
	public void imprimeDispositivo(String nomeDispositivo) {
		
		boolean encontrou = false;
		
		for (String nome : nomes) {
			
			if (nome.equals(nomeDispositivo)
					&& mapDispositivos.get(nome) != null) {
				
				System.out.println(mapDispositivos.get(nome));
				encontrou = true;
				
			}
			
		}
		
		if (!encontrou) {
			System.out.println("\nO dispositivo procurado não existe!");
		}
		
	}

	/**
	 * TODO FELIPE - O método não está sendo utilizado, mas temos uma 
	 * oportunidade de melhorar a lógica e até mesmo o nome do método 
	 * para gerar novos conhecimentos
	 * @param dispositivo
	 */
	public void getDispositivos(Dispositivo dispositivo) {
		
		for (Dispositivo item : mapDispositivos.values()) {
			
			if (identificaDispositivo(dispositivo).equals("N")) {
				if (item.caracterEscondido(item, item.toString()).charAt(0) == 'N') {
					System.out.println(item.toString());
				}
			} else if (identificaDispositivo(dispositivo).equals("S")) {
				if (item.caracterEscondido(item, item.toString()).charAt(0) == 'S') {
					System.out.println(item.toString());
				}

			} else if (identificaDispositivo(dispositivo).equals("T")) {
				if (item.caracterEscondido(item, item.toString()).charAt(0) == 'T') {
					System.out.println(item.toString());
				}
			}
			
		}
		
	}

	public void imprimeTodosDispositivos() {
		
		int contador = 1;
		
		for (Dispositivo dispositivo : mapDispositivos.values()) {
			System.out.println("\nDispositivo: " + contador + ":\n" + dispositivo);
			contador++;
		}
		
	}

	public String caracterEscondido(Object obj, String toString) {
		
		toString = identificaDispositivo(obj);
		toString = toString + toString();
		
		return toString;
		
	}

	/**
	 * TODO FELIPE - refatorar para usarmos StringBuilder,
	 * perguntar sobre StringBuilder. 
	 */
	@Override
	public String toString() {
		return "\nDispositivo: " + nomeDispositivo + "\nMarca: " + marcaDispositivo + "\nTipo de alimentação: "
				+ alimentacao + "\nTamanho da tela: " + tamanhoTela + " polegadas " + "\nDuração da bateria: " + duracaoBateria
				+ " horas";
	}

}
