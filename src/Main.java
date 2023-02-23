import units.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
    public static void main(String[] args) {



        ArrayList<Human> Heroes = new ArrayList<>();




            switch (new Random().nextInt(0, 6)) {
                case 0:
                    Heroes.add(new Crossbowman(getName()));
                case 1:
                    Heroes.add(new Monk(getName()));
                case 2:
                    Heroes.add(new Peasant(getName()));
                case 3:
                    Heroes.add(new Sniper(getName()));
                case 4:
                    Heroes.add(new Robber(getName()));
                case 5:
                    Heroes.add(new Sorcerer(getName()));
                case 6:
                    Heroes.add(new Spearman(getName()));

            }

                System.out.println(Heroes);
    }

}

