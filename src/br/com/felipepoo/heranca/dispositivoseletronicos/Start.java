package br.com.felipepoo.heranca.dispositivoseletronicos;

public class Start {

	public static void main(String[] args) {
		
		Dispositivo note = new Notebook("Acer", "Nitro", "cabo e bateria", 14.2, 4);
		Dispositivo smart = new Smartphone("Samsung", "Galaxy", "cabo e bateria", 8.2, 12);
		Dispositivo tv = new Televisao("LG", "Flatron", "cabo", 20, 0);

		note.ativaMetodoEspecial();
		
		smart.ativaMetodoEspecial();
		smart.ativaMetodoEspecial();
		
		tv.ativaMetodoEspecial();
		
		note.imprimeDispositivo("Acer");
		smart.imprimeDispositivo("Galaxy");
		tv.imprimeTodosDispositivos();
		
	}
	
}
