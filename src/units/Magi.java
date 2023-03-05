package units;

public  abstract  class Magi extends Human {

    int magic;
    public Magi(String name, int att, int def,float hp, int MaxHp, int speed, int damage, int maxDamage, int magic, int PosX, int PosY) {
        super(name, att, def,hp, MaxHp, speed, damage, maxDamage, PosX, PosY);
        this.magic = magic;
    }

    public abstract void step();
}
