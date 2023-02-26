package units;
public class Sniper extends Arrows {
    public Sniper(String name) {
        super(name, 12, 10, 15, 32, 9, 8, 10);
    }

    public String toString(){
        return "Я снайпер " + name;
    }
    public void step() {

    }
    public String getInfo(){
        return "";
    }
}
