package units;

public class Peasant extends Fermer {

    public Peasant(String name) {
        super(name, 1, 1, 1,1, 1, 1, 1, 0,0);
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

