package units;

public class Peasant extends infantry{

    public Peasant(String name) {
        super(name, 9,13,90,12,12);
    }

    public String toString(){
        return "Я крестьянин " + name;
    }
    public void step() {

    }
    public String getInfo(){
        return "";
    }
}

