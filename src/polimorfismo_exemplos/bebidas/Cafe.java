package polimorfismo_exemplos.bebidas;

public class Cafe extends Bebida {

	public Cafe() {
		nomeDaBebida = "Café";
		caracteristica = "Forte";
	}

	@Override
	public String tipoDeBebida() {
		return "Natural";
	}

	@Override
	public String efeitoDaBebida() {
		return "Tornar ativo";
	}

	@Override
	public String colateralDaBebida() {
		return "Problemas psicológicos e dependência";
	}


}
