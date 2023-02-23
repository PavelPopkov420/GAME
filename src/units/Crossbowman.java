package units;

public class Crossbowman extends Arrows{

    public Crossbowman(String name) {
        super(name, 25,15,120,20,30);
    }
    public void step() {

    }

    public String getInfo(){
        return "Я арбалетчик" + name;
    }
}
