package polimorfismo_exemplos.mundo_animal;

public class Voadores extends Animal {

    @Override
    public void locomover() {
        System.out.println("O animal voador está voadno");
    }
    
    @Override
    public void respirar() {
        System.out.println("O animal voador está respirando");
    }
    
    @Override
    public String getNomeAcaoLocomer() {
        return "voando";
    }
    
}
