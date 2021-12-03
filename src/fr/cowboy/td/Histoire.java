package fr.cowboy.td;

public class Histoire {
    public static void main(String[] args) {
        Dame jaqueline = new Dame("Jacqueline","rouge");
        Brigand avrel = new Brigand("Avrel");
        Cowboy luc = new Cowboy("Luc");
        Barman bob = new Barman("Bob", "Le fût");
        Sherif nico = new Sherif("Nico");


        Humain[] humains = new Humain[5];
        humains[0]= jaqueline;
        humains[1]= avrel;
        humains[2]= luc;
        humains[3]= bob;
        humains[4]= nico;

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
