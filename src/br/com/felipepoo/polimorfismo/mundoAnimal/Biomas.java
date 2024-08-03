package br.com.felipepoo.polimorfismo.mundoAnimal;

import java.util.HashMap;
import java.util.Map;

public class Biomas {

	private Animal animal;
	private String bioma;
	public Map<String, Animal> biomas;

	public Biomas(String pBioma, Animal pAnimal) {
		animal = pAnimal;
		bioma = pBioma;
		biomas = new HashMap<>();
		biomas.put(bioma, animal);
	}

	public void addAnimalBioma(String pBioma, Animal animal) {
		if (!pBioma.equals(bioma)) {
			System.out.println("Bioma " + pBioma + " inválido para instância de " + bioma + "\n");
			return;
		}
		biomas.put(pBioma, animal);
	}

	public void getAnimaisBioma(String pBioma) {
		if (!pBioma.equals(bioma)) {
			System.out.println("Bioma " + pBioma + " inválido para instância de " + bioma + "\n");
		} else {
			for (String bioma : biomas.keySet()) {
				if (bioma.equals(pBioma)) {
					System.out.println(biomas.get(bioma));
				}
			}
		}
	}

	public void getBiomas() {
		for (String bioma : biomas.keySet()) {
			System.out.println(bioma);
		}
	}

	@Override
	public String toString() {
		return animal.toString() + "\n" + bioma;
	}

}
