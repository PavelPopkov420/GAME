package units;

public class Monk extends Magi{

    public Monk(String name, Vector2D coords)
    {
        super(name, 12, 7, 30,30, 5, -4, -4, 1, coords.PosX, coords.PosY);
    }
    public String toString(){
        return "Монах "+name + "|" + "HP" + hp + " PosX " + coords.PosX + " PosY "+ coords.PosY;
    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Монах:  \t").append(Monk.super.name)
                .append("\t| ATK:\t").append(Monk.super.att)
                .append("\t| HP:\t").append(Monk.super.hp)
                .append(" \t| MP:\t").append(Monk.super.magic)
                .append("\t|").append("\t| (X.Y) : ").append(Monk.super.coords.PosX).append(".").append(Monk.super.coords.PosY);
    }

}
