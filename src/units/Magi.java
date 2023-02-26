package units;

public  abstract  class Magi extends Human {

    int magic;
    public Magi(String name, int att, int def, int hp, int speed, int damage, int maxDamage, int magic) {
        super(name, att, def, hp, speed, damage, maxDamage);
        this.magic = magic;
    }
}
