package br.com.felipepoo.polimorfismo.mundoAnimal;

public class Terrestres extends Animal {

	public Terrestres() {
		tipo = "Terrestre";
	}
	
	@Override
	public void locomover() {
		System.out.println( String.format("Terrestre está nadando", tipo) );
	}
	
	@Override
	public void comer() {
		System.out.println( String.format("Terrestre está comendo", tipo) );
	}
	
	@Override
	public void respirar() {
		System.out.println( String.format("Terrestre está respirando", tipo) );		
	}
    
}
