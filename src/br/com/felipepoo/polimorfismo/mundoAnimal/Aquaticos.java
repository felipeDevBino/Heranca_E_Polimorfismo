package br.com.felipepoo.polimorfismo.mundoAnimal;

public class Aquaticos extends Animal {

	public Aquaticos() {
		tipo = "Aquático";
	}
	
	@Override
	public void locomover() {
		System.out.println( String.format("Aquático está nadando", tipo) );
	}
	
	@Override
	public void comer() {
		System.out.println( String.format("Aquático está comendo", tipo) );
	}
	
	@Override
	public void respirar() {
		System.out.println( String.format("Aquático está respirando", tipo) );		
	}
    
}
