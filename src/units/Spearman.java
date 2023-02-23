package units;

public class Spearman extends infantry {

    public Spearman(String name) {
        super(name, 20,30,120,8,13);
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

