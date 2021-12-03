package fr.cowboy.td;

public class Histoire {
    public static void main(String[] args) {
        Dame jaqueline = new Dame("Jacqueline", "lait","rouge");
        Brigand avrel = new Brigand("Avrel", "tord-boyaux");
        Cowboy luc = new Cowboy("Luc", "whisky");
        Barman bob = new Barman("Bob", "Vin");


        Humain[] humains = new Humain[4];
        humains[0]= jaqueline;
        humains[1]= avrel;
        humains[2]= luc;
        humains[3]= bob;

        for (int i = 0; i <humains.length ; i++) {
            humains[i].introduce();
        }

        jaqueline.changeDress("Violette");
        avrel.drink();
        avrel.kidnap(jaqueline);
        luc.shoot(avrel);
        luc.releaseWomen(jaqueline);
    }
}
