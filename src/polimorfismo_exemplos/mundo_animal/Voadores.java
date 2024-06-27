package polimorfismo_exemplos.mundo_animal;

public class Voadores extends Animal {

	public Voadores() {
		nome();
		respiracao();
		locomocao();
		alimentacao();
		predadores();
		bioma();
		caracteristicas();

	}

	@Override
	public void respiracao() {
		respiracao = "pulmonar";
	}

	@Override
	public void locomocao() {
		locomocao = "aérea";
	}

	@Override
	public String getAnimal() {
		String animal = String.format(
				"Animal voador\n\nNome: %s\nRespiração: %s\nLocomoção: %s\nAlimentação: %s\nPredadores: %s\nBioma: %s\nCaracterísticas: %s\n",
				getNome(), getRespiracao(), getLocomocao(), getAlimentacao(), getPredadores(), getBioma(),
				getCaracteristicas());
		return animal;
	}

}
