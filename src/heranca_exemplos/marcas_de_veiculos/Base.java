package heranca_exemplos.marcas_de_veiculos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Base {

	private Scanner scanner;
	protected String nomeDaMarcaOriginal, nomeDaMarca;
	protected String nome;
	protected String tipoDeVeiculo;

	protected int kmPorLitro;
	protected int velocidade;
	protected int valor;
	protected int fimDoNomeDaMarca;

	protected List<String> veiculos;
	protected List<String> concessionarias;
	protected List<String> preDefinidos;

	public Base() {
		scanner = new Scanner(System.in);
		veiculos = new ArrayList<>();
		concessionarias = new ArrayList<>();
		preDefinidos = new ArrayList<>();
	}

	public void criaVeiculo(String pMarca, String pNome, String pTipoDeVeiculo, int pKmPorLitro, int pVelocidade,
			int pValor) {
		nomeDaMarca = pMarca;
		nome = pNome;
		tipoDeVeiculo = pTipoDeVeiculo;
		kmPorLitro = pKmPorLitro;
		velocidade = pVelocidade;
		valor = pValor;

		veiculos.add("Marca: " + nomeDaMarca + "\nNome: " + nome + "\nTipo de Veículo: " + tipoDeVeiculo
				+ "\nKM por litro de combustível: " + kmPorLitro + "\nVelocidade máxima: " + velocidade
				+ "\nPreço sugerido: " + valor + "R$.");

		boolean existeUmIgual = false;

		if (veiculos.size() > 1) {
			for (int i = 1; i < veiculos.size(); i++) {
				if (veiculos.get(i).equals(veiculos.get(i - 1))) {
					existeUmIgual = true;
				}
			}
		}

		if (!existeUmIgual) {
			System.out.println("\nVeículo " + nome + " da marca " + nomeDaMarca + " criado com sucesso!");
			System.out.println("\n" + veiculos.get(veiculos.size() - 1));

		} else {
			System.out.println(
					"\nErro! Um veículo semelhante já foi construido!\nO veículo " + nome + " não foi construído!");
		}

	}

	public void getVeiculos() {
		if (veiculos.size() == 0) {
			System.out.println("\nNão há mais veículos construídos!");
		} else {
			System.out.println("\nTodos os Veículos");
			for (int i = 0; i < veiculos.size(); i++) {
				System.out.println("\n" + (i + 1) + " - " + veiculos.get(i) + "\n");
			}
		}
	}

	public void enviaVeiculo() {
		boolean existeUmIgual = false;

		for (int i = 0; i < concessionarias.size(); i++) {
			if (concessionarias.get(i).equals(veiculos.get(veiculos.size() - 1))) {
				System.out.println(
						"\nErro! Veículo " + nome + " da marca " + nomeDaMarca + " já existente na concessionária!");
				existeUmIgual = true;
				break;
			}
		}
		if (!existeUmIgual) {
			concessionarias.add(veiculos.get(veiculos.size() - 1));
			veiculos.remove(veiculos.size() - 1);
			System.out.println("\nVeículo enviado a concessionária.");
		}
	}

	public void enviaVeiculosManualmente() {
		int escolha = 0;
		int posicao = 0;
		do {
			getVeiculos();
			System.out.println(
					"\nDigite o veículo que deseja enviar para a concessionária através de seu número.\n(Digite 0 quando terminar):");
			escolha = Integer.parseInt(scanner.nextLine());
			if (escolha > veiculos.size()) {
				System.out.println("\nPosição inválida!");
			}
			if (escolha != 0) {
				escolha -= 1;

				boolean existeUmIgual = false;
				for (int i = 0; i < concessionarias.size(); i++) {
					if (concessionarias.get(i).equals(veiculos.get(escolha))) {
						System.out.println("\nErro! Veículo já existente na concessionária!");
						existeUmIgual = true;
						break;
					}
				}

				if (!existeUmIgual) {
					System.out.println("\nVeículo encontrado: " + veiculos.get(escolha));
					concessionarias.add(posicao, veiculos.get(escolha));
					System.out.println(posicao);
					veiculos.remove(escolha);
				}
				posicao++;
				escolha = 1;
			}else if(escolha != veiculos.size()) {
				System.out.println("\nVeículo inexistente!");
			}
		} while (escolha != 0);
	}

	public void concessionaria() {
		StringBuilder marca = new StringBuilder();
		StringBuilder ultimoCaractere = new StringBuilder();

		int contador = 0;
		boolean completouMarca = false;
		for (int i = (concessionarias.size() - 1); i >= 0; i--) {
			for (int j = 7; j <= 100; j++) {
				marca.append(concessionarias.get(i).charAt(j));
				ultimoCaractere.append(marca.charAt(contador));

				if (ultimoCaractere.charAt(ultimoCaractere.length() - 1) == nomeDaMarcaOriginal
						.charAt(nomeDaMarcaOriginal.length() - 1) && marca.toString().equals(nomeDaMarcaOriginal)) {
					completouMarca = true;
					fimDoNomeDaMarca = j;
					break;
				}

				ultimoCaractere.delete(0, ultimoCaractere.length());
				contador++;
			}
			if (completouMarca) {
				break;
			}
		}
		marca.delete(0, marca.length());

		System.out.println("\nConcessionária " + nomeDaMarcaOriginal);
		int posicao = 1;

		for (int i = 0; i < concessionarias.size(); i++) {
			for (int j = 7; j <= fimDoNomeDaMarca; j++) {
				marca.append(concessionarias.get(i).charAt(j));
			}
			if (marca.toString().equals(nomeDaMarcaOriginal)) {
				System.out.println("\n" + posicao + " - " + concessionarias.get(i));
				posicao++;
			}
			marca.delete(0, marca.length());
		}

	}
}
