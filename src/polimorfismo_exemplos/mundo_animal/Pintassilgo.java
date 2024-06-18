package polimorfismo_exemplos.mundo_animal;


public class Pintassilgo extends Voadores {

    @Override
    public void locomover() {
        String nomeAcaoLocomover = super.getNomeAcaoLocomer();
        String msgLocomover = String.format("O Pintassilgo está %s", nomeAcaoLocomover);
        System.out.println(msgLocomover);
    }
    
}
