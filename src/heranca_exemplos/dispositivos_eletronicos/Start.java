package heranca_exemplos.dispositivos_eletronicos;

public class Start {

	public static void main(String[] args) {
		
		Base note = new Notebook("Acer", "Nitro", "cabo e bateria", 14.2, 4);
		Base smart = new Smartphone("Samsung", "Galaxy", "cabo e bateria", 8.2, 12);
		Base tv = new Televisao("LG", "Flatron", "cabo", 20, 0);

		note.ativaMetodoEspecial();
		smart.ativaMetodoEspecial();
		smart.ativaMetodoEspecial();
		tv.ativaMetodoEspecial();
		
		smart.getDispositivo("Galaxy", smart);
		
		tv.getTodosDispositivos();
		
		Base.scanner.close();
		
	}
	
}
