package fr.cowboy.td;

public class Cowboy extends Humain{

    private int popularity;
    private String characteristic;

    public Cowboy(String name, String drink) {
        super(name, drink);
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

    @Override
    public void introduce() {
        super.introduce();
        this.talk("Les autres disent que je suis " + this.characteristic + " ! Et c'est un fait je le suis !");
        this.talk("Mon niveau de popularité est de " + this.popularity);
    }

}
