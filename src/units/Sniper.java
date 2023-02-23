package units;
public class Sniper extends Arrows {

    public Sniper(String name) {
        super(name, 20,20,100,10,12);
    }
    public void step() {

    }
    public String getInfo(){
        return "Я снайпер" + name;
    }
}
