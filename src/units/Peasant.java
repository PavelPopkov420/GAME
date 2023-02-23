package units;

public class Peasant extends infantry{

    public Peasant(String name) {
        super(name, 9,13,90,12,12);
    }
    public void step() {

    }
    public String getInfo(){
        return "Я крестьянин" + name;
    }
}

