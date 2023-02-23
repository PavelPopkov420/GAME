package units;

public class Monk extends Magi{

    public Monk(String name) {
        super(name, 5,30,100,10,15,10);
    }

    public void step() {

    }
    public String getInfo(){
        return "Я монах" + name;
    }
}
