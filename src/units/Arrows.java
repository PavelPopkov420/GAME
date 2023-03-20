package units;

import java.util.ArrayList;

public abstract class Arrows extends Human{
    int shots;


    public Arrows(String name, int att, int def,float hp, int MaxHp, int shots, int speed, int MinDamage,int PosX, int PosY
            , int maxDamage) {
        super(name, att, def, hp, MaxHp, speed, MinDamage, PosX,PosY, maxDamage);
        this.shots = shots;

    }
    public void step(ArrayList<Human> team1, ArrayList<Human> team2){
        if (state.equals("Die") || shots == 0) return;
        Human victim = team2.get(findNearest(team2));
        int damage = (victim.def - att) > 0 ? MinDamage :(victim.def - att) < 0 ? maxDamage : (MinDamage + maxDamage)/2;
        victim.getDamage(damage);
        for (Human human:team1){
            if(human.getInfo().toString().split(":")[0].equals("Фермер") && human.state.equals("Stand")){
                human.state = "Busy";
                return;
            }
        }
        shots--;
        }

    public String toString() {
        return name +
                " H:" + Math.round(hp) +
                " D:" + def +
                " A:" + att +
                " Dmg:" + Math.round(Math.abs((MinDamage+maxDamage)/2)) +
                " Shots:" + shots + " " +
                state;
    }

}
