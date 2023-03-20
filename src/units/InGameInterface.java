package units;

import java.util.ArrayList;

public interface InGameInterface {

    void step(ArrayList<Human> team1, ArrayList<Human> team2);

    StringBuilder getInfo();

}
