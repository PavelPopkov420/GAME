package units;

public class Robber extends Warriors {
    public Robber(String name, Vector2D coords) {

        super(name, 8, 3, 10,10, 4, 2, 6, coords.PosX, coords.PosY);
    }

    public String toString(){
        return "Разбойник "+name + "|" + "HP" + hp + " PosX " + coords.PosX + " PosY "+ coords.PosY;
    }

    public String getInfo(){
        return "";
    }

    @Override
    public void step() {

    }
}
