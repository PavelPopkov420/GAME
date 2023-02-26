package units;

public class Spearman extends Warriors {

    public Spearman(String name) {
        super(name, 4, 5, 10, 3, 1, 4);
    }

    public String toString(){
        return "Я копейщик " + name;
    }
    @Override
    public void step() {

    }
    @Override
    public String getInfo(){
        return "";
    }
}

