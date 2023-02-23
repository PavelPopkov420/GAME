package units;

public class Spearman extends infantry {

    public Spearman(String name) {
        super(name, 20,30,120,8,13);
    }
    public void step() {

    }
    public String getInfo(){
        return "Я копейщик" + name;
    }
}

