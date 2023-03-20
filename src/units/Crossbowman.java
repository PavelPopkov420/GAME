package units;

public class Crossbowman extends Arrows{

    public Crossbowman(String name, Vector2D coords){

        super(name, 6, 3, 10,10, 16, 4, 2, coords.PosX, coords.PosY, 3);
    }
    public String toString(){
        return "Арбалетчик "+name + "|" + "HP" + hp + " PosX " + coords.PosX + " PosY "+ coords.PosY;
    }


    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Арбалет: \t").append(Crossbowman.super.name)
                .append("\t| ATK:\t").append(Crossbowman.super.att)
                .append("\t| HP:\t").append(Crossbowman.super.hp)
                .append(" \t| Arrows:").append(Crossbowman.super.shots)
                .append("\t|").append("\t| (X.Y) : ").append(Crossbowman.super.coords.PosX).append(".").append(Crossbowman.super.coords.PosY);
    }


}
