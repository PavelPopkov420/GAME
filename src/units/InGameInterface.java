package units;

import java.util.ArrayList;

public interface InGameInterface {

    StringBuilder getInfo();
    boolean step(ArrayList<Human> team1, ArrayList<Human> team2);

}
