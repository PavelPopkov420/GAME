package units;

public class Monk extends Magi{

    public Monk(String name) {
        super(name, 12, 7, 30,30, 5, -4, -4, 1, 0,0);
    }

    public String toString(){
        return "Я монах " + name;
    }

    @Override
    public void step() {

    }
    public String getInfo(){
        return "";
    }
}
