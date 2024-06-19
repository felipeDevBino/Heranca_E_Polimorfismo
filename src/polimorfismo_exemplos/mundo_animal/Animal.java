package polimorfismo_exemplos.mundo_animal;

public abstract class Animal {

    protected String nome;
    protected String respiracao;
    protected String locomocao;
    protected String alimentacao;
    protected String predadores;
    protected String bioma;
    protected String caracteristicas;
    
    public void nome() {}
    public void locomocao() {};
    public void alimentacao() {};
    public void predadores() {};
    public void bioma() {};
    public void caracteristicas() {};
    
    public abstract void respiracao();


    public String getNome() {
    	return nome;
    }
    public String getRespiracao() {
    	return respiracao;
    }
    public String getLocomocao() {
    	return locomocao;
    }
    public String getAlimentacao() {
    	return alimentacao;
    }
    public String getPredadores() {
    	return predadores;
    }
    public String getBioma() {
    	return bioma;
    }
    public String getCaracteristicas() {
    	return caracteristicas;
    }
    
    public abstract String getAnimal();
    
    @Override
	public String toString() {
		return getAnimal();
	}
    
}
