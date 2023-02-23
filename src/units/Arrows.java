package units;

public abstract class Arrows extends Human{
    int shots, maxShots;

    public Arrows(String name, int att, int def, int hp, int shots, int maxShots) {
        super(name, att, def, hp);
        this.shots = shots;
        this.maxShots = maxShots;
    }
}
