package fr.cowboy.td;

public class Indien extends Humain{

    private String totem;
    private int numberFeather;

    public Indien(String name) {
        super(name, "Jus de racine");
        this.totem = "Coyotte";
    }

    public void scalp(VisagePale visagePale){
        this.setNumberFeather(1);
        visagePale.scalp();
    }

    @Override
    public void talk(String text) {
        super.talk(text + "Ugh!");
    }

    @Override
    public void introduce() {
        super.introduce();
        this.talk("J'ai " + this.numberFeather + " plumes");
    }

    public void setNumberFeather(int numberFeather) {
        this.numberFeather += numberFeather;
    }
}
