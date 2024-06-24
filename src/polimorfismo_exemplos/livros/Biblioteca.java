package polimorfismo_exemplos.livros;

import java.util.Map;
import java.util.HashMap;

public class Biblioteca extends BaseFisica_Conceitual {

	Map<String, BaseFisica_Conceitual> livrosRevistasJornais = new HashMap<>();

	public void compraItem(Cliente cliente, String item) {
		int valor = livrosRevistasJornais.get(item).valor;

		if (cliente.getSaldo() >= valor) {
			cliente.comprados.add(livrosRevistasJornais.get(item));
			cliente.subtraiSaldo(valor);

		} else {
			System.out.println("Saldo insuficiente para adquirir " + item);
		}
	}

	public void setItem(BaseFisica_Conceitual item) {
		livrosRevistasJornais.put(item.nome, item);
	}

	public void getItens() {
		System.out.println("\nItens da biblioteca:");
		for (BaseFisica_Conceitual item : livrosRevistasJornais.values()) {
			System.out.println("\n" + item);
		}
	}

}
