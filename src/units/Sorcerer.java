package units;

public class Sorcerer extends Magi {

    public Sorcerer(String name) {
        super(name, 40,5,90,8,10,0);
    }
    @Override
    public void step() {

    }
    @Override
    public String getInfo(){
        return "Я колдун" + name;
    }
}