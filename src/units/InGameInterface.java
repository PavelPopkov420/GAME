package units;

import java.util.ArrayList;

public interface InGameInterface {

    abstract void step(ArrayList<Human> team1, ArrayList<Human> team2);

    String getInfo();

}
