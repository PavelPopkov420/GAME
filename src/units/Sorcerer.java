package units;

public class Sorcerer extends Magi {

    public Sorcerer(String name) {
        super(name, 40,5,90,8,10,0);
    }
    public void step() {

    }
    public String getInfo(){
        return "Я колдун" + name;
    }
}