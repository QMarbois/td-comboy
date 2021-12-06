package fr.cowboy.td;

public class Dame extends Humain implements VisagePale{

    private String dressColor;
    private Boolean isFree;

    public Dame(String name, String dressColor) {
        super(name, "lait");
        this.dressColor= dressColor;
        this.isFree = true;
    }

    public void kidnaped(){
        this.talk("HHHHHEEEEEEEELLLLLPPPPPPP!");
        this.setFree();
    }

    public void released(Cowboy cowboy){
        this.setFree();
        this.talk("Merci " + cowboy.getName() + ", je suis liiiiiiibre");
        cowboy.setPopularity(1);
    }

    public void changeDress(String dressColor){
        this.talk("Regardez ma nouvelle robe de couleur " + dressColor + " ! Elle est belle hein ?");
    }

    public void setFree() {
        isFree = !this.isFree;
    }

    @Override
    public String getName() {
        return "Miss " + super.getName();
    }

    @Override
    public void introduce() {
        super.introduce();
        this.talk("Avez vous vu que ma robe est " + this.dressColor + " ? Elle est magnifique n'est ce pas ?");
    }

    @Override
    public void scalp() {
        talk("Aïe ma tête !");
    }
}
