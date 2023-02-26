package units;

public abstract class Human implements InGameInterface{
    protected  String name;
    protected int att, def, hp, speed, damage, maxDamage;

    public Human(String name, int att, int def, int hp, int speed,int damage, int maxDamage){
        this.name = name;
        this.att = att;
        this.def = def;
        this.hp = hp;
        this.speed = speed;
        this.damage = damage;
        this.maxDamage = maxDamage;
    }

    protected Human() {
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "null";
    }
}
