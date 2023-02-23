package units;

public  abstract  class Magi extends Human {
    int magicStrike;
    int maxMagicStrike;
    int healthUp;

    public Magi(String name, int att, int def, int hp, int magicStrike, int maxMagicStrike, int healthUp) {
        super(name, att, def, hp);
        this.magicStrike = magicStrike;
        this.maxMagicStrike = maxMagicStrike;
        this.healthUp = healthUp;
    }
}
