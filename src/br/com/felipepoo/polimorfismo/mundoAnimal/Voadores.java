package br.com.felipepoo.polimorfismo.mundoAnimal;

public class Voadores extends Animal {

	public Voadores() {
		tipo = "Voadores";
	}
	
	@Override
	public void locomover() {
		System.out.println( String.format("Voadores está nadando", tipo) );
	}
	
	@Override
	public void comer() {
		System.out.println( String.format("Voadores está comendo", tipo) );
	}
	
	@Override
	public void respirar() {
		System.out.println( String.format("Voadores está respirando", tipo) );		
	}
    
}
