package units;

public abstract class Human implements InGameInterface{
    protected  String name;
    protected int att, def, hp;

    public Human(String name, int att, int def, int hp){
        this.name = name;
        this.att = att;
        this.def = def;
        this.hp = hp;
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
