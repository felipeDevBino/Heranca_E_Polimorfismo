package polimorfismo_exemplos.mundo_animal;

public class Aquaticos extends Animal {

    @Override
    public void locomover() {
        System.out.println("O animal aquatico está se locomovendo");
    }
    
    @Override
    public void respirar() {
        System.out.println("O animal aquatico está respirando");
    }
    
    @Override
    public String getNomeAcaoLocomer() {
        return "nadando";
    }
    
}
