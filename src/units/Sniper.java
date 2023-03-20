package units;
public class Sniper extends Arrows {


    public Sniper(String name, Vector2D coords) {
        super(name, 12, 10, 15, 15, 32, 9, 8, coords.PosX, coords.PosY, 10);
    }

    public String toString(){
        return "Снайпер "+name + "|" + "HP" + hp + " PosX " + coords.PosX + " PosY "+ coords.PosY;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Снайпер:\t").append(Sniper.super.name)
                .append("\t| ATK:\t").append(Sniper.super.att)
                .append("\t| HP:\t").append(Sniper.super.hp)
                .append(" \t| Arrows:").append(Sniper.super.shots)
                .append("\t|").append("\t| (X.Y) : ").append(Sniper.super.coords.PosX).append(".").append(Sniper.super.coords.PosY);
    }

}
