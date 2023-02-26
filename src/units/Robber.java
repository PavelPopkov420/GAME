package units;

public class Robber extends Warriors {
    public Robber(String name) {
        super(name, 8, 3, 10, 4, 2, 6);
    }

    public String toString(){
        return "Я разбойник " + name;
    }

    public String getInfo(){
        return "";
    }
}
