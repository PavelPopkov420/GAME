package units;

import java.util.ArrayList;

public abstract class Fermer extends Human{

    int delivery;

    public Fermer(String name, Vector2D coords) {
        super(name, 1, 1, 50, 1, 1, 1, 1, coords.PosX, coords.PosY);
        this.delivery = 1;
    }

    public String toString(){
        return "Фермер "+name + "|" + "HP" + hp + " PosX " + coords.PosX + " PosY "+ coords.PosY;
    }

    public void step(ArrayList<Human> team1, ArrayList<Human> team2){
        if(!state.equals("Die") && !state.equals("Busy")) state = "STAND";

    }

    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Фермер: \t").append(Fermer.super.name)
                .append("\t| ATK:\t").append(Fermer.super.att)
                .append("\t| HP:\t").append(Fermer.super.hp)
                .append(" \t| Delivery: ").append(Fermer.this.delivery)
                .append("\t|").append("\t| (X.Y) : ").append(Fermer.super.coords.PosX).append(".").append(Fermer.super.coords.PosY);
    }
}

