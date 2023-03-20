package units;

public class Spearman extends Warriors {

    public Spearman(String name, Vector2D coords) {

        super(name, 4, 5,10, 10, 3, 1, 4, coords.PosX, coords.PosY);
    }

    public String toString(){
        return "КОпейщик "+name + "|" + "HP" + hp + " PosX " + coords.PosX + " PosY "+ coords.PosY;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Копейщик:\t").append(Spearman.super.name)
                .append("\t| ATK:\t").append(Spearman.super.att)
                .append("\t| HP:\t").append(Spearman.super.hp)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Spearman.super.coords.PosX).append(".").append(Spearman.super.coords.PosY);
    }

}

