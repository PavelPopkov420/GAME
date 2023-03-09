package units;
public class Sniper extends Arrows {


    public Sniper(String name, Vector2D coords) {
        super(name, 12, 10, 15, 15, 32, 9, 8, coords.PosX, coords.PosY, 10);
    }

    public String toString(){
        return "Снайпер "+name + "|" + "HP" + hp + " PosX " + coords.PosX + " PosY "+ coords.PosY;
    }
    public void step() {

    }
    public String getInfo(){
        return "" ;
    }
}
