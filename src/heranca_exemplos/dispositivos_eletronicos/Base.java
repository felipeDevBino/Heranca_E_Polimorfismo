package heranca_exemplos.dispositivos_eletronicos;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Base {

	public static Scanner scanner = new Scanner(System.in);
	protected static Map<String, Base> dispositivos = new HashMap<>();
	protected static List<String> nomes = new ArrayList<>(), chaves = new ArrayList<>();
	protected String marcaDoDispositivo, nomeDoDispositivo, alimentacao;
	protected double tamanhoDaTela;
	protected int duracaoDaBateria;

	public Base(String pMarcaDoDispositivo, String pNomeDoDispositivo, String pAlimentacao, double pTamanhoDaTela,
			int pDuracaoDaBateria) {
		marcaDoDispositivo = pMarcaDoDispositivo;
		nomeDoDispositivo = pNomeDoDispositivo;
		alimentacao = pAlimentacao;
		tamanhoDaTela = pTamanhoDaTela;
		duracaoDaBateria = pDuracaoDaBateria;
		
		nomes.add(nomeDoDispositivo);
		dispositivos.put(nomeDoDispositivo, this);
	}

	protected String getNomeDaClasse() {
		return this.getClass().getName();
	}
	private String identificaDispositivo(Object obj) {
		if (obj instanceof Notebook) {
			return "N";
		} else if (obj instanceof Smartphone) {
			return "S";
		} else if (obj instanceof Televisao) {
			return "T";
		}
		return "";
	}

	public void getDispositivo(String nomeDoDispositivo, Base base) {
		boolean encontrou = false;
		for (String nome : nomes) {
			if (nome.equals(nomeDoDispositivo)) {
				if (dispositivos.get(nome) != null) {
					System.out.println(dispositivos.get(nome));
					encontrou = true;
				}
			}
		}
		if (!encontrou) {
			System.out.println("\nO dispositivo procurado não existe!");
		}
	}

	public void getDispositivos(Base base) {
		for (Base item : dispositivos.values()) {
			if (identificaDispositivo(base).equals("N")) {
				if (item.caracterEscondido(item, item.toString()).charAt(0) == 'N') {
					System.out.println(item.toString());
				}
			} else if (identificaDispositivo(base).equals("S")) {
				if (item.caracterEscondido(item, item.toString()).charAt(0) == 'S') {
					System.out.println(item.toString());
				}

			} else if (identificaDispositivo(base).equals("T")) {
				if (item.caracterEscondido(item, item.toString()).charAt(0) == 'T') {
					System.out.println(item.toString());
				}
			}
		}
	}

	public void getTodosDispositivos() {
		int contador = 1;
		for (Base dispositivo : dispositivos.values()) {
			System.out.println("\nDispositivo: " + contador + ":\n" + dispositivo);
			contador++;
		}
	}

	public void ativaMetodoEspecial() {
		if(identificaDispositivo(this).equals("N")) {
			Notebook.modos();
		} else if(identificaDispositivo(this).equals("S")) {
			Smartphone.lanternaLigadaOuDesligada();
		}else if(identificaDispositivo(this).equals("T")) {
			Televisao.canais();
		}
	}
	
	public String caracterEscondido(Object obj, String toString) {
		toString = identificaDispositivo(obj);
		toString = toString + toString();
		return toString;
	}

	@Override
	public String toString() {
		return "\nDispositivo: " + nomeDoDispositivo + "\nMarca: " + marcaDoDispositivo + "\nTipo de alimentação: "
				+ alimentacao + "\nTamanho da tela: " + tamanhoDaTela + " polegadas " + "\nDuração da bateria: " + duracaoDaBateria
				+ " horas";
	}

}
