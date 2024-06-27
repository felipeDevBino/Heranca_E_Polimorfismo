package polimorfismo_exemplos.mundo_animal;

import polimorfismo_exemplos.mundo_animal.animais.Pintassilgo;
import polimorfismo_exemplos.mundo_animal.animais.Lambari;
import polimorfismo_exemplos.mundo_animal.animais.Pinscher;

public class Start {

    public static void main(String[] args) {
        
    	Animal pintassilgo = new Pintassilgo();
	    System.out.println(pintassilgo.getAnimal());	
	    
	    Animal lambari = new Lambari();
	    System.out.println(lambari.getAnimal());
	    
	    Animal pinscher = new Pinscher();
	    System.out.println(pinscher.getAnimal());
	    
	    Biomas biomaUrbano = new Biomas("urbano", pinscher);
	    Biomas biomaFlorestal = new Biomas("florestal", pintassilgo);
	    Biomas biomaAquatico = new Biomas("lagos savana", lambari);
	    
	    biomaUrbano.getAnimaisBioma("urbano");
	    biomaUrbano.getAnimaisBioma("florestal");
	    biomaFlorestal.getAnimaisBioma("florestal");
	    biomaAquatico.getAnimaisBioma("lagos savana");
	    
    }

}
