package units;

public class Robber extends Warriors {
    public Robber(String name, Vector2D coords) {

        super(name, 8, 3, 10,10, 4, 2, 6, coords.PosX, coords.PosY);
    }

    public String toString(){
        return "Разбойник "+name + "|" + "HP" + hp + " PosX " + coords.PosX + " PosY "+ coords.PosY;
    }
    public void steal(int disguise, Arrows Shooter) {
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Бандит: \t").append(Robber.super.name)
                .append("\t| ATK:\t").append(Robber.super.att)
                .append("\t| HP:\t").append(Robber.super.hp)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Robber.super.coords.PosX).append(".").append(Robber.super.coords.PosY);
    }

    }
