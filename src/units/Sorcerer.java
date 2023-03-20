package units;

public class Sorcerer extends Magi {

    public Sorcerer(String name, int att, int def, float hp, int MaxHp, int speed, int damage, int maxDamage, int magic, int PosX, int PosY) {
        super(name, att, def, hp, MaxHp, speed, damage, maxDamage, magic, PosX, PosY);
    }

    public Sorcerer(String name, Vector2D coords) {

        super(name, 17, 12, 30, 30, 9, -5, -5, 1, coords.PosX, coords.PosY);
    }

    public String toString(){
        return "Колдун "+name + "|" + "HP" + hp + " PosX " + coords.PosX + " PosY "+ coords.PosY;
    }
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Колдун: \t").append(Sorcerer.super.name)
                .append("\t| ATK:\t").append(Sorcerer.super.att)
                .append("\t| HP:\t").append(Sorcerer.super.hp)
                .append(" \t| MP:\t").append(Sorcerer.super.magic)
                .append("\t|").append("\t| (X.Y) : ").append(Sorcerer.super.coords.PosX).append(".").append(Sorcerer.super.coords.PosY);
    }
}