package units;

public abstract class Human {
    protected  String name;
    protected int att;
    protected int def;
    protected int hp;
    public Human(String name, int att, int def, int hp){
        this.name = name;
        this.att = att;
        this.def = def;
        this.hp = hp;
    }

    protected Human() {
    }
}
