package units;

public class Peasant extends Warriors {

    public Peasant(String name) {
        super(name, 1, 1, 1, 1, 1, 3);
    }

    public Peasant(int delivery) {
        super(1);
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

