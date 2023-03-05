import units.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Main {
    static final int UNITS = 10;
    public static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);}

    public static void main(String... args) {
        ArrayList<Human> DarkTeam = new ArrayList<>();
        ArrayList<Human> teamOfLight = new ArrayList<>();
        ArrayList<Human> allTeam = new ArrayList<>();
        CreateTeam(DarkTeam, 0);
        CreateTeam(teamOfLight, 3);
        allTeam.addAll(DarkTeam);
        allTeam.addAll(teamOfLight);



    }
    static void CreateTeam(ArrayList Team, int offset) {

        for (int i = 0; i < UNITS; i++) {
            int rnd = new Random().nextInt(4) + offset;


            switch (rnd) {
                case 0:
                    Team.add(new Robber(getName()));
                    break;
                case 1:
                    Team.add(new Sniper(getName()));
                    break;
                case 2:
                    Team.add(new Sorcerer(getName()));
                    break;
                case 3:
                    Team.add(new Peasant(getName()));
                    break;
                case 4:
                    Team.add(new Spearman(getName()));
                    break;
                case 5:
                    Team.add(new Crossbowman(getName()));
                    break;
                case 6:
                    Team.add(new Monk(getName()));
                    break;

            }
        }

    }
    static void SortTeam(ArrayList<Human> Teams) {
        Teams.sort(new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return 0;
            }
        });
    }}








