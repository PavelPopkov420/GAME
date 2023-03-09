package units;

import java.util.ArrayList;

public abstract class Fermer extends Human{

    int delivery;

    public Fermer(String name, int att, int def,float hp, int MaxHp, int speed, int damage, int maxDamage,int PosX, int PosY) {
        super(name, att, def, hp, MaxHp, speed, damage, maxDamage, PosX, PosY);
        this.delivery = delivery;
    }

    public void step(ArrayList<Human> team1, ArrayList<Human> team2){
        if(!state.equals("Die") && !state.equals("Busy")) state = "STAND";

    }

    public String getInfo() {
        return "Фермер";
    }
}

