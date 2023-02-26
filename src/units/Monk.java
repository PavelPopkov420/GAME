package units;

public class Monk extends Magi{

    public Monk(String name) {
        super(name, 12, 7, 30, 5, -4, -4, 1);
    }

    public String toString(){
        return "Я монах " + name;
    }

    public void step() {

    }
    public String getInfo(){
        return "";
    }
}
