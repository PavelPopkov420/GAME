package units;

public class Sorcerer extends Magi {

    public Sorcerer(String name) {
        super(name, 17, 12, 30,30, 9, -5, -5, 1,0,0);
    }

    public String toString(){
        return "Я колдун " + name;
    }
    public void step() {

    }
    public String getInfo(){
        return "";
    }
}