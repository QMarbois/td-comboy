package fr.cowboy.td;

public class Ripoux extends Sherif implements Outlaw{
    private Boolean prisonner;
    private double reward;
    private int kidnaping;

    public Ripoux(String name) {
        super(name);
        this.prisonner = false;
        this.reward = 100.00;
        this.kidnaping = 0;
    }

    @Override
    public void toJail(Cowboy cowboy) {
        this.talk("Damned, je suis fait ! " + cowboy.getName() + " tu m'as eu chien !");
        this.setPrisonner();
    }

    private void setPrisonner() {
        this.prisonner = !this.prisonner;
    }

    @Override
    public void kidnap(Dame dame) {
        this.talk("Ah ah ! " + dame.getName() + ", tu es mienne désormais !");
        dame.kidnaped();
        this.setKidnaping(1);
        this.setReward(100.00);
    }

    private void setReward(double reward) {
        this.reward += reward;
    }

    public void setKidnaping(int kidnaping) {
        this.kidnaping += kidnaping;
    }

    @Override
    public double getReward() {
        return reward;
    }
}
