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
    public static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);}

    public static void main(String... args) {

        Scanner user_input = new Scanner(System.in);
        System.out.print("Press Enter to begin.");
        user_input.nextLine();

        ArrayList<Human> DarkTeam = new ArrayList<>();
        ArrayList<Human> teamOfLight = new ArrayList<>();

        ArrayList<Human> allTeam = new ArrayList<>();
        CreateTeam(DarkTeam, 0, 1);
        CreateTeam(teamOfLight, 3, 10);
        allTeam.addAll(DarkTeam);
        allTeam.addAll(teamOfLight);

        String stop = "";

        while (stop.equals("")){
        for (Human human: allTeam) {
            if (teamOfLight.contains(human)) human.step(teamOfLight, DarkTeam);
            else human.step(DarkTeam, teamOfLight);
        }
        stop = user_input.nextLine();
        allTeam.forEach(n -> System.out.println(n.getInfo()));
        }


        for (int i =0; i< 10; i++){
        System.out.println(teamOfLight.get(i));}
        System.out.println(" ");
        for (int i =0; i< 10; i++){
        System.out.println(DarkTeam.get(i));}
        System.out.println(" ");
        for (int i =0; i< 20; i++){
            System.out.println(allTeam.get(i));
        }




    }
    static void CreateTeam (ArrayList Team, int offset, int PosY) {

        for (int i = 0; i < UNITS; i++) {
            int rnd = new Random().nextInt(4) + offset;


            switch (rnd) {
                case 0:
                    Team.add(new Robber(getName(), new Vector2D(i+1, PosY)));
                    break;
                case 1:
                    Team.add(new Sniper(getName(), new Vector2D(i+1, PosY)));
                    break;
                case 2:
                    Team.add(new Sorcerer(getName(),new Vector2D(i+1, PosY)));
                    break;
                case 3:
                    Team.add(new Peasant(getName(),new Vector2D(i+1, PosY)));
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
    static void SortTeam(ArrayList<Human> Teams) {
        Teams.sort(new Comparator<Human>() {
                @Override
                public int compare(Human t0, Human t1) {
                    if (t1.getSpeed() == t0.getSpeed()) return (int) (t1.getHp() - t0.getHp());
                    else  return (int) (t1.getSpeed() - t0.getSpeed());
            }});
    }
}









