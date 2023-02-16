import units.*;

public class Main {
    public static void main(String[] args) {
        Crossbowman Bob = new Crossbowman("Bob",5,5,30);
        Monk Pop = new Monk("Pop",10,40,80);
        Peasant Mykola = new Peasant("Mykola", 5,5,20);
        Rogue Bandit = new Rogue("Bandit",10,10,30);
        Sniper Jack = new Sniper("Jack",30,10,40);
        Spearman Kop = new Spearman("Kop",15,20,30);
        System.out.println(Bob);
        System.out.println(Pop);
        System.out.println(Mykola);
        System.out.println(Bandit);
        System.out.println(Jack);
        System.out.println(Kop);}
}