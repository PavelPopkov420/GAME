package units;

public class Monk extends Magi{

    public Monk(String name, Vector2D coords)
    {
        super(name, 12, 7, 30,30, 5, -4, -4, 1, coords.PosX, coords.PosY);
    }

    public String toString(){
        return "Монах " +name + "|" + "HP" + hp + " PosX " + coords.PosX + " PosY "+ coords.PosY;
    }

    @Override
    public void step() {

    }
    public String getInfo(){
        return "" ;
    }
}
