package units;

public abstract class Arrows extends Human{
    int shots;

    public Arrows(String name, int att, int def, int hp, int shots, int speed, int damage, int maxDamage) {
        super(name, att, def, hp, speed, damage, maxDamage);
        this.shots = shots;

    }

}
