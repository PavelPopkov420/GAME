package units;

public class Peasant extends Fermer {

    public Peasant(String name, Vector2D coords) {

        super(name, 1, 1, 30,1, 1, 1, 1, coords.PosX, coords.PosY);
    }

    public String toString(){
        return "Крестьянин " +name + "|" + "HP" + hp + " PosX " + coords.PosX + " PosY "+ coords.PosY;
    }
    public void step() {

    }
    public String getInfo(){
        return "" ;
    }
}

