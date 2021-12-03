package fr.cowboy.td;

public class Cowboy extends Humain{

    private int popularity;
    private String characteristic;

    public Cowboy(String name) {
        super(name);
        this.popularity = 0;
        this.characteristic = "Vaillant";
    }

    public void setPopularity(int popularity) {
        this.popularity += popularity;
    }

    public void shoot(Brigand brigand){
        System.out.println("Le " + this.characteristic + " " + this.getName() + " tire sur " + brigand.getName() + ". PAN!");
        this.talk("Prend ca, rascal !");
        brigand.capture(this);
    }

    public void releaseWomen(Dame dame){
        this.talk("Eh mademoiselle, vous êtes charmante et désormais libre !");
        dame.released(this);
    }

}
