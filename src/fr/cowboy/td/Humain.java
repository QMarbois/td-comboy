package fr.cowboy.td;

public class Humain {
    private String name;
    private String drink;

    public Humain(String name){
        this.name = name;
        this.drink = "Water";
    }

    public void talk(String text){
        System.out.println("(" + name + ") - " + text);
    }

    public void introduce (){
        this.talk("Bonjour, je suis " + this.getName() + " et ma boisson favorite est : " + this.getDrink());
    }

    public void drink (){
        this.talk("Ahhh ! Un bon verre de " + this.drink + " ! GLOUPS !");
    }

    public String getName() {
        return this.name;
    }

    public String getDrink() {
        return this.drink;
    }
}
