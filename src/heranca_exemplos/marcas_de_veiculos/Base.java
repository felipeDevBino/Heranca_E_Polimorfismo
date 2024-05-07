package heranca_exemplos.marcas_de_veiculos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Base {

	public static Scanner scanner = new Scanner(System.in);
	protected String marca;
	protected String nome;
	protected String tipoDeVeiculo;
	protected int quantidadeDePortas;
	protected int quantidadeDeRodas;
	public static int veiculoEmOrdem = 0;
	protected List<String> veiculosEsquematizados = new ArrayList<String>();
	protected List<String> veiculosConstruidos = new ArrayList<String>();
	protected Map<String, String> concessionarias = new HashMap<String, String>();
	private int quantidadeDeMateriaisDisponiveis = 30, materiais = 8;

	public void esquematizaModelo(String marca, String nome, String tipoDeVeiculo, int quantidadeDePortas,
			int quantidadeDeRodas) {
		this.tipoDeVeiculo = tipoDeVeiculo;
		this.quantidadeDePortas = quantidadeDePortas;
		this.quantidadeDeRodas = quantidadeDeRodas;
		this.marca = marca;
		this.nome = nome;

		veiculosEsquematizados.add(Base.veiculoEmOrdem,
				"Marca: " + marca + "\nNome: " + nome + "\nTipo de Veículo: " + tipoDeVeiculo
						+ "\nQuantidade de Portas: " + quantidadeDePortas + "\nQuantidade de Rodas: "
						+ quantidadeDeRodas);

	}

	public void getMateriais(int quantidadeDePortas, int quantidadeDeRodas) {
		boolean insuficiente = false;

		if (quantidadeDePortas > 0 && quantidadeDeRodas > 0) {
			materiais -= quantidadeDePortas;
			materiais -= quantidadeDeRodas;
			if (materiais <= 0) {
				insuficiente = true;
			}
		}

		if (insuficiente) {
			veiculosEsquematizados.remove(Base.veiculoEmOrdem);
			System.out.println("Erro! Materiais Insuficientes!");
		} else {
			veiculosConstruidos.add(Base.veiculoEmOrdem, veiculosEsquematizados.get(Base.veiculoEmOrdem));
			System.out.println("Veículo construído com sucesso a partir do modelo esquematizado!");
		}

	}

	public void solicitaMateriais(String material, int quantidade) {
		if (quantidadeDeMateriaisDisponiveis < quantidade) {
			System.out.println(
					"Erro! A quantidade de materiais na distribuidora é insuficiente para satisfazer a requisição!");
		} else {
			quantidadeDeMateriaisDisponiveis -= quantidade;
			materiais += quantidade;

		}

	}

	public void distribuiVeiculos() {
		int escolha = 1;
		do {
			getVeiculosConstruidos();
			System.out.println(
					"Digite o veículo que deseja distribuir através de seu número. (Digite 00 quando terminar):");
			escolha = Integer.parseInt(scanner.nextLine());

			if(escolha == 00) {
				return;
			}
			
			if(escolha >= veiculosConstruidos.size()) {
				escolha = (veiculosConstruidos.size() - 1);
			}

			for (String veiculo : veiculosConstruidos) {
				if (veiculosConstruidos.get(escolha) == veiculo) {
					System.out.println("Veículo encontrado: " + veiculo);
				}
			}

			concessionarias.put(marca, veiculosConstruidos.get(escolha));

		} while (escolha != 00);
	}

	public void getVeiculosConstruidos() {
		int posicao = 1;
		for (String veiculo : veiculosConstruidos) {
			System.out.println(posicao + " - " + veiculo);
			posicao++;
		}
	}

}
