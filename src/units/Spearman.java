package units;

public class Spearman extends Warriors {

    public Spearman(String name, Vector2D coords) {

        super(name, 4, 5,10, 10, 3, 1, 4, coords.PosX, coords.PosY);
    }

    public String toString(){
        return "Копейщик " +name + "|" + "HP" + hp + " PosX " + coords.PosX + " PosY "+ coords.PosY ;
    }
    @Override
    public void step() {

    }
    @Override
    public String getInfo(){
        return "" ;
    }
}

