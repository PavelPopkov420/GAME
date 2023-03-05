package units;

public abstract class Fermer extends Human{

    int delivery;

    public Fermer(String name, int att, int def,float hp, int MaxHp, int speed, int damage, int maxDamage,int PosX, int PosY) {
        super(name, att, def, hp, MaxHp, speed, damage, maxDamage, PosX, PosY);
        this.delivery = delivery;
    }

    public String getInfo() {
        return "Фермер";
    }
}

