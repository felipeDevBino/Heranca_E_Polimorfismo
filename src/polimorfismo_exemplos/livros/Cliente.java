package polimorfismo_exemplos.livros;

import java.util.List;
import java.util.ArrayList;

public class Cliente {

	public List<BaseFisica_Conceitual> comprados = new ArrayList<>();
	public int saldo;
	
	public void setSaldo(int nSaldo) {
		saldo = nSaldo;
	}
	
	public void subtraiSaldo(int sSaldo) {
		saldo -= sSaldo;
	}
	
	public int getSaldo() {
		return saldo;
	}
	
	public void getSaldoImpresso() {
		System.out.println("\nSaldo do cliente: " + saldo);
	}
	
	public void getComprados() {
		System.out.println("\nItem(s) comprados:");
		for(BaseFisica_Conceitual comprado : comprados) {
			System.out.println("\n" + comprado);
		}
	}
}
