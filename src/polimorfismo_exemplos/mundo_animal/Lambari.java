package polimorfismo_exemplos.mundo_animal;


public class Lambari extends Aquaticos {

    @Override
    public void locomover() {
        
        nome = "Nemo";
        
        String nomeLocomocao = super.getNomeAcaoLocomer();
        String msgLocomover = String.format("O Lambari %s está %s", nome, nomeLocomocao);
        System.out.println(msgLocomover);
    }
    
}
