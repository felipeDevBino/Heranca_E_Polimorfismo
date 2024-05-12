package heranca_exemplos.marcas_de_veiculos;

public class Start {

	public static void main(String[] args) {

		Fiat veiculosFiat = new Fiat();
		
		veiculosFiat.criaVeiculo("Fiat", "Uno Mille Smart", "Carro Urbano", 13, 130, 13000);
		veiculosFiat.criaVeiculo("Fiat", "Uno Mille Smart", "Carro Urbano", 13, 130, 13000);
		veiculosFiat.criaVeiculo("Fiat", "Uno Mille Fire", "Carro Urbano", 16, 150, 20000);
		veiculosFiat.criaVeiculo("Fiat", "Punto", "Carro Urbano", 14, 120, 30000);
		veiculosFiat.criaVeiculo("Volkswagen", "Gol", "Carro Urbano", 20, 180, 50000);
		veiculosFiat.criaVeiculo("Chevrolet", "Chevelle", "Carro Clássico", 20, 180, 400000);
		
		veiculosFiat.getVeiculos();
		veiculosFiat.distribuiVeiculos();
		
		veiculosFiat.concessionariaFiat();

		Chevrolet veiculosChevrolet = new Chevrolet();
		
		veiculosChevrolet.criaVeiculo("Fiat", "Uno Mille Smart", "Carro Urbano", 13, 130, 13000);
		veiculosChevrolet.criaVeiculo("Fiat", "Uno Mille Smart", "Carro Urbano", 13, 130, 13000);
		veiculosChevrolet.criaVeiculo("Fiat", "Uno Mille Fire", "Carro Urbano", 16, 150, 20000);
		veiculosChevrolet.criaVeiculo("Fiat", "Punto", "Carro Urbano", 14, 120, 30000);
		veiculosChevrolet.criaVeiculo("Volkswagen", "Gol", "Carro Urbano", 20, 180, 50000);
		veiculosChevrolet.criaVeiculo("Chevrolet", "Chevette", "Carro Clássico", 20, 180, 25000);
		veiculosChevrolet.criaVeiculo("Chevrolet", "Camaro", "Carro Esportivo", 20, 180, 200000);

		veiculosChevrolet.getVeiculos();
		veiculosChevrolet.distribuiVeiculos();
		
		veiculosChevrolet.concessionariaChevrolet();
		
		Volkswagen veiculosVolkswagen = new Volkswagen();
		
		veiculosVolkswagen.criaVeiculo("Fiat", "Uno Mille Smart", "Carro Urbano", 13, 130, 13000);
		veiculosVolkswagen.criaVeiculo("Fiat", "Uno Mille Smart", "Carro Urbano", 13, 130, 13000);
		veiculosVolkswagen.criaVeiculo("Fiat", "Uno Mille Fire", "Carro Urbano", 16, 150, 20000);
		veiculosVolkswagen.criaVeiculo("Fiat", "Punto", "Carro Urbano", 14, 120, 30000);
		veiculosVolkswagen.criaVeiculo("Volkswagen", "Gol", "Carro Urbano", 20, 180, 50000);
		veiculosVolkswagen.criaVeiculo("Chevrolet", "Chevette SL", "Carro Urbano", 20, 180, 25000);
		veiculosVolkswagen.criaVeiculo("Volkswagen", "Gol Flex", "Carro Urbano", 20, 180, 55000);
		
		veiculosVolkswagen.getVeiculos();
		veiculosVolkswagen.distribuiVeiculos();

		veiculosVolkswagen.concessionariaVolkswagen();
	}

}
