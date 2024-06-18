package polimorfismo_exemplos.bebidas;

import java.util.Scanner;

public abstract class Bebida {

	public static Scanner scanner = new Scanner(System.in);
	protected String nomeDaBebida;
	protected String caracteristica;
	protected String texto;
	
	public abstract String tipoDeBebida();

	public abstract String efeitoDaBebida();

	public abstract String colateralDaBebida();

	public void getBebida() {
		texto = String.format(
				"Nome da bebida: %s\nCaracterística: %s\nTipo de bebida: %s\nEfeito da bebida: %s\nColateral da bebida: %s\n",
				nomeDaBebida, caracteristica, tipoDeBebida(), efeitoDaBebida(), colateralDaBebida());
		System.out.println(texto);
	}

}
