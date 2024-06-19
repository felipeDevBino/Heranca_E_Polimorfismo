package polimorfismo_exemplos.mundo_animal;

public class Aquaticos extends Animal {

	public Aquaticos() {
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
		respiracao = "brânquias";
	}

	@Override
	public void locomocao() {
		locomocao = "aquática";	
	}

	@Override
	public String getAnimal() {
		String animal = String.format(
				"Animal aquático\n\nNome: %s\nRespiração: %s\nLocomoção: %s\nAlimentação: %s\nPredadores: %s\nBioma: %s\nCaracterísticas: %s\n",
				getNome(), getRespiracao(), getLocomocao(), getAlimentacao(), getPredadores(), getBioma(),
				getCaracteristicas());
		return animal;
	}


    
}
