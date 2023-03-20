package units;

import java.util.ArrayList;

public  abstract  class Magi extends Human {

    int magic;
    public Magi(String name, int att, int def,float hp, int MaxHp, int speed, int damage, int maxDamage, int magic, int PosX, int PosY) {
        super(name, att, def,hp, MaxHp, speed, damage, maxDamage, PosX, PosY);
        this.magic = magic;
    }
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {
        for (Human human : team1) {
            if (human.hp < human.MaxHp & !human.state.equals("Die")) {
                human.getDamage(maxDamage);
                return;
            }
        }

    }
}
