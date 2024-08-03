package br.com.felipepoo.polimorfismo.mundoAnimal;

public abstract class Animal {

	/**
	 * Caracteristicas gerais do animal
	 */
    protected String nome;
    protected String tipo;
    protected String respiracao;
    protected String locomocao;
    protected String alimentacao;
    protected String predadores;
    protected String bioma;
    protected String caracteristicas;
    
    public String getAnimal() {
    	
    	String animal = String.format(
				"Animal %s\n\nNome: %s\nRespiração: %s\nLocomoção: %s\nAlimentação: %s\nPredadores: %s\nBioma: %s\nCaracterísticas: %s\n",
				tipo, nome, respiracao, locomocao, alimentacao, predadores, bioma, caracteristicas);
    	
		return animal;
		
    }
    
    /**
     * Comportamentos padrões de todo animal
     * @return
     */
    public abstract void respirar();
    
    public abstract void locomover();
    
    public abstract void comer();
    
    @Override
	public String toString() {
		return getAnimal();
	}
    
}
