package fr.cowboy.td;

public class Barman extends Humain{

    private String barName;

    public Barman(String name) {
        super(name, "vin");
        this.barName = "Chez " + this.getName();
    }

    public Barman(String name, String barName) {
        super(name, "vin");
        this.barName = "Chez " + barName;
    }

    @Override
    public void introduce() {
        super.introduce();
        this.talk("Je suis le joyeux propriétaire du bar " + this.barName);
    }

    @Override
    public void talk(String text) {
        super.talk(text + " coco");
    }
}
