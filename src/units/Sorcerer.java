package units;

public class Sorcerer extends Magi {

    public Sorcerer(String name, Vector2D coords) {

        super(name, 17, 12, 30,30, 9, -5, -5, 1, coords.PosX, coords.PosY);
    }

    public String toString(){
        return "Колдун " +name + "|" + "HP" + hp + " PosX " + coords.PosX + " PosY "+ coords.PosY ;
    }
    public void step() {

    }
    public String getInfo(){
        return "";
    }
}