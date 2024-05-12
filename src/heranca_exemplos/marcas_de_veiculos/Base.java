package heranca_exemplos.marcas_de_veiculos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Base {

	public static Scanner scanner = new Scanner(System.in);
	protected String marca;
	protected String nome;
	protected String tipoDeVeiculo;
	protected int kmPorLitro;
	protected int velocidade;
	protected int valor;
	public static int veiculoEmOrdem = 1;
	protected List<String> veiculos = new ArrayList<String>();
	protected List<String> concessionarias = new ArrayList<String>();
	public int quantidadeDeMateriaisDisponiveis = 30, materiais = 8;

	public void criaVeiculo(String marca, String nome, String tipoDeVeiculo, int kmPorLitro, int velocidade,
			int valor) {
		this.marca = marca;
		this.nome = nome;
		this.tipoDeVeiculo = tipoDeVeiculo;
		this.kmPorLitro = kmPorLitro;
		this.velocidade = velocidade;
		this.valor = valor;
		boolean existeUmIgual = false;

		veiculos.add((Base.veiculoEmOrdem - 1),
				"Marca: " + marca + "\nNome: " + nome + "\nTipo de Veículo: " + tipoDeVeiculo
						+ "\nKM por litro de combustível: " + kmPorLitro + "\nVelocidade máxima: " + velocidade
						+ "\nPreço sugerido: " + valor + "R$.");
		if (Base.veiculoEmOrdem > veiculos.size()) {
			Base.veiculoEmOrdem = veiculos.size();
		}

		for (int i = 0; i < (veiculos.size() - 1); i++) {
			if (veiculos.get(i).equals(veiculos.get(Base.veiculoEmOrdem - 1))) {
				existeUmIgual = true;
			}
		}

		if (!existeUmIgual) {
			System.out.println("\n" + Base.veiculoEmOrdem + " veículo criado com sucesso!");
			System.out.println("\n" + veiculos.get(Base.veiculoEmOrdem - 1));
			Base.veiculoEmOrdem++;

		} else {
			System.out.println(
					"\nErro! Um veículo semelhante já foi construido!\nO veículo " + nome + " não foi construído!");
			veiculos.remove((Base.veiculoEmOrdem - 1));
		}

	}

	public void distribuiVeiculos() {
		int escolha = 1;
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

				boolean jaExiste = false;
				for (int i = 0; i < concessionarias.size(); i++) {
					if (concessionarias.get(i) == veiculos.get(escolha)) {
						System.out.println("Erro! Veículo já existente na concessionária!");
						jaExiste = true;
						break;
					}
				}

				if (!jaExiste) {
					System.out.println("\nVeículo encontrado: " + veiculos.get(escolha));
					concessionarias.add(posicao, veiculos.get(escolha));
					veiculos.remove(escolha);
					Base.veiculoEmOrdem--;
				}
				posicao++;
				escolha = 1;
			}
		} while (escolha != 0);
		Base.veiculoEmOrdem = 1;
	}

	public void getVeiculos() {
		if (veiculos.size() == 0) {
			System.out.println("\nNão há mais veículos construídos!");
		}
		System.out.println("\nTodos os Veículos");
		for (int i = 0; i < veiculos.size(); i++) {
			System.out.println("\n" + (i + 1) + " - " + veiculos.get(i) + "\n");
		}
	}

}
