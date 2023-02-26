package units;

public class Crossbowman extends Arrows{

    public Crossbowman(String name) {
        super(name, 6, 3, 10, 16, 4, 2, 3);
    }

    public String toString(){
        return "Я арбалетчик " + name;
    }
    public void step() {

    }

    public String getInfo(){
        return "";
    }
}
