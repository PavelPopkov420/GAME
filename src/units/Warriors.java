package units;

public abstract  class Warriors extends Human{


    public Warriors(String name, int att, int def, int hp, int maxDamage, int damage, int speed) {
        super(name, att, def, hp, speed, damage, maxDamage);


    }
    int delivery;
    public Warriors(int delivery) {
        super();
        this.delivery = delivery;
    }
}

