package units;

public class Robber extends infantry{
    public Robber(String name) {
        super(name, 20, 30, 100, 10, 12);
    }

    public String toString(){
        return "Я разбойник " + name;
    }

    public String getInfo(){
        return "";
    }
}
