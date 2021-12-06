package fr.cowboy.td;

public class DameBrigand extends Dame implements Outlaw{

    private Boolean prisonner;
    private int kidnaping;
    private double reward;

    public DameBrigand(String name, String dressColor) {
        super(name, dressColor);
        this.prisonner = false;
        this.kidnaping = 0;
        this.reward = 100.00;
    }

    public void setPrisonner() {
        this.prisonner = !this.prisonner;
    }

    public void setReward(double reward) {
        this.reward += reward;
    }

    public void setKidnaping(int kidnaping) {
        this.kidnaping += kidnaping;
    }

    @Override
    public void toJail(Cowboy cowboy) {
        this.talk("Damned, je suis fait ! " + cowboy.getName() + " tu m'as eu chien !");
        this.setPrisonner();
    }

    @Override
    public void kidnap(Dame dame) {
        this.talk("Ah ah ! " + dame.getName() + ", tu es mienne désormais !");
        dame.kidnaped();
        this.setKidnaping(1);
        this.setReward(100.00);
    }

    @Override
    public double getReward() {
        return reward;
    }
}
