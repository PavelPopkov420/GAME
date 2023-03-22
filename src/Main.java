import units.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static final int UNITS = 10;
    public static ArrayList<Human> allTeam = new ArrayList<>();
    public static ArrayList<Human> teamOfLight = new ArrayList<>();
    public static ArrayList<Human> DarkTeam = new ArrayList<>();



    public static void main(String... args) {

        try (Scanner user_input = new Scanner(System.in)) {
            System.out.print("Press Enter to begin.");
            user_input.nextLine();
            CreateTeam(teamOfLight, 0, 1);
            CreateTeam(DarkTeam, 3, 10);
            allTeam.addAll(teamOfLight);
            allTeam.addAll(DarkTeam);
            sortTeam(allTeam);

            boolean a = true;
            int countBlue = 0;
            int countGreen = 0;
            while (a) {
                View.view();
                user_input.nextLine();
                countBlue = 0;
                countGreen = 0;
                for (Human human : allTeam) {
                    if (teamOfLight.contains(human)) {
                        if (human.step(teamOfLight, DarkTeam))
                            countBlue++;
                    } else {
                        if ((human.step(DarkTeam, teamOfLight)))
                            countGreen++;
                    };
                }
                if (countBlue == UNITS || countGreen == UNITS)
                    a = false;
            }
            if (countBlue == UNITS)
                System.out.print("greenTeam wins");
            else {
                System.out.print("blueTeam wins");
            }
        }
        }

    static void CreateTeam (ArrayList Team, int offset, int PosY) {

        for (int i = 0; i < UNITS; i++) {
            int rnd = new Random().nextInt(4) + offset;


            switch (rnd) {
                case 0:
                    Team.add(new Bandit(getName(), new Vector2D(i+1, PosY)));
                    break;
                case 1:
                    Team.add(new Sniper(getName(), new Vector2D(i+1, PosY)));
                    break;
                case 2:
                    Team.add(new Sorcerer(getName(),new Vector2D(i+1, PosY)));
                    break;
                case 3:
                    Team.add(new Fermer(getName(), new Vector2D(i + 1, PosY)) {
                    });
                    break;
                case 4:
                    Team.add(new Spearman(getName(),new Vector2D(i+1, PosY)));
                    break;
                case 5:
                    Team.add(new Crossbowman(getName(),new Vector2D(i+1, PosY)));
                    break;
                case 6:
                    Team.add(new Monk(getName(), new Vector2D(i+1, PosY)));
                    break;

            }
        }

    }

    static void sortTeam(ArrayList<Human> team) {
        team.sort(new Comparator<Human>() {
            @Override
            public int compare(Human t0, Human t1) {
                if (t1.getSpeed() == t0.getSpeed())
                    return (int) (t1.getHp() - t0.getHp());
                else
                    return (int) (t1.getSpeed() - t0.getSpeed());
            }
        });
    }
    static void SortTeam(ArrayList<Human> Teams) {
        Teams.sort(new Comparator<Human>() {
                @Override
                public int compare(Human t0, Human t1) {
                    if (t1.getSpeed() == t0.getSpeed()) return (int) (t1.getHp() - t0.getHp());
                    else  return (int) (t1.getSpeed() - t0.getSpeed());
            }});
    }

    static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }
}









