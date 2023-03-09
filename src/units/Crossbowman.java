package units;

public class Crossbowman extends Arrows{

    public Crossbowman(String name, Vector2D coords){

        super(name, 6, 3, 10,10, 16, 4, 2, coords.PosX, coords.PosY, 3);
    }

    public String toString(){
        return "Арбалетчик "+name + "|" + "HP" + hp + " PosX " + coords.PosX + " PosY "+ coords.PosY;
    }
    public void step() {

    }

    public String getInfo(){
        return "" ;
    }
}
