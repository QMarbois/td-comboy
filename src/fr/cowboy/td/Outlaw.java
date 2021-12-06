package fr.cowboy.td;

public interface Outlaw {
    public void toJail(Cowboy cowboy);
    public void kidnap(Dame dame);
    public double getReward();
    public String getName();
}
