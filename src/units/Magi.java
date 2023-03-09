package units;

import java.util.ArrayList;

public  abstract  class Magi extends Human {

    int magic;
    public Magi(String name, int att, int def,float hp, int MaxHp, int speed, int damage, int maxDamage, int magic, int PosX, int PosY) {
        super(name, att, def,hp, MaxHp, speed, damage, maxDamage, PosX, PosY);
        this.magic = magic;
    }
    protected Human findlowhp(ArrayList<Human> Team){
        double minhp = Double.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < Team.size(); i++)
        {
            if(minhp > Team.get(i).MaxHp- Team.get(i).hp)
                index = i;
                minhp = Team.get(i).MaxHp- Team.get(i).hp;
        }
        return Team.get(index);
    }


    public void step(ArrayList<Human> team1){
        if(state.equals("Die")) return;
        Human victim = findlowhp(team1);
        int damage = (victim.def - att) > 0 ? MinDamage :(victim.def - att) < 0 ? maxDamage : (MinDamage + maxDamage)/2;
        victim.getDamage(damage);
        magic -= 1;



    }

    public abstract void step();
}
