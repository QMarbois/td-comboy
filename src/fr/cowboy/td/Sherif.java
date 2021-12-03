package fr.cowboy.td;

public class Sherif extends Cowboy{

    private int nbBrigandCaptured;

    public Sherif(String name) {
        super(name);
    }

    public void catchBrigand(){
        this.talk("Au nom de la loi je vous arrete !!");
    }

    public void lookingForBrigand( Brigand brigand){
        System.out.println("Le shérif " + this.getName() + " placarde un avis de recherche");
        this.talk("OYEZ OYEZ BRAVE GENS !!" + brigand.getReward() + " $ à qui arretera " + brigand.getName() + " le brigand mort ou vif !!");
    }

    @Override
    public void introduce() {
        super.introduce();
        this.talk("Je suis un super Sherif! J'ai coffré " + this.nbBrigandCaptured + " brigands !!");
    }

    @Override
    public String getName() {
        return "Sherif";
    }
}
