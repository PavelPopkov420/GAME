package units;

import java.util.ArrayList;

public  abstract  class Magi extends Human {

    protected int mana;
    protected int maxMana;

    @Override
    public boolean step(ArrayList<Human> team1, ArrayList<Human> team2) {
        for (Human human: team1) {
            if (human.hp < human.maxHp & !human.state.equals("Die")) {
                human.getDamage(damageMax);
                return false;
            }
        }
        return false;
    }

    public Magi(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense,
               int speed, int mana, int maxMana, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
        this.mana = mana;
        this.maxMana = maxMana;
    }
}
