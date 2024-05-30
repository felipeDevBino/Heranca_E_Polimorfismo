package polimorfismo_exemplos.mundo_animal;


public class Pintassilga extends Voadores {

    @Override
    public void locomover() {
        String nomeAcaoLocomover = super.getNomeAcaoLocomer();
        String msgLocomover = String.format("O Pintassilga está %s", nomeAcaoLocomover);
        System.out.println(msgLocomover);
    }
    
}
