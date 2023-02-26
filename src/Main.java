import units.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static String getName(){

    return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);}
    public static void main(String... args) {


            ArrayList<Human> DarkTeam = new ArrayList<>();
            for (int i = 0; i < 10; i++  )
            {
                switch (new Random().nextInt(0, 4)) {
                    case 0:
                        DarkTeam.add(new Peasant(getName()));
                        break;

                    case 1:
                        DarkTeam.add(new Robber(getName()));
                        break;

                    case 2:
                        DarkTeam.add(new Sniper(getName()));
                        break;

                    case 3:
                        DarkTeam.add(new Sorcerer(getName()));
                }
            }
            DarkTeam.sort(new Comparator<Human>() {
                @Override
                public int compare(Human o1, Human o2) {
                    return 0;
                }
            });

            ArrayList<Human> teamOfLight = new ArrayList<>();

            for (int i = 0; i < 10; i++  ) {

                switch (new Random().nextInt(0, 4)) {
                    case 0:
                        teamOfLight.add(new Peasant(getName()));
                        break;
                    case 1:
                        teamOfLight.add(new Spearman(getName()));
                        break;
                    case 2:
                        teamOfLight.add(new Crossbowman(getName()));
                        break;
                    case 3:
                        teamOfLight.add(new Monk(getName()));
                        break;



                }

            }
            teamOfLight.sort(new Comparator<Human>() {
                @Override
                public int compare(Human o1, Human o2) {
                    return 0;
                }
            });

            System.out.println(DarkTeam);
            System.out.print("");
            System.out.println(teamOfLight);
            System.out.print("");


        }
    }




