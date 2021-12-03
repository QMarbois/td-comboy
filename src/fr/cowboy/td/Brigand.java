package fr.cowboy.td;

public class Brigand extends Humain{

    private String look;
    private int kidnaping;
    private double reward;
    private Boolean prisonner;

    public Brigand(String name) {
        super(name, "tord-boyaux");
        this.look = "Méchant";
        this.kidnaping = 0;
        this.reward = 100.00;
        this.prisonner = false;

    }

    public void kidnap (Dame dame){
        this.talk("Ah ah ! " + dame.getName() + ", tu es mienne désormais !");
        dame.kidnaped();
        this.setKidnaping(1);
        this.setReward(100.00);
    }

    public void capture (Cowboy cowboy){
        this.talk("Damned, je suis fait ! " + cowboy.getName() + " tu m'as eu chien !");
        this.setPrisonner();
    }

    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward += reward;
    }

    public void setKidnaping(int kidnaping) {
        this.kidnaping += kidnaping;
    }

    public void setPrisonner() {
        this.prisonner = !this.prisonner;
    }

    @Override
    public String getName() {
        return super.getName() + " le " + this.look;
    }

    @Override
    public void introduce() {
        super.introduce();
        this.talk("je suis " + this.look + " et j'ai kidnappé " + this.kidnaping + " dames!");
        this.talk("Ma tête est mise à prix à " + this.reward + " $");
    }
}
