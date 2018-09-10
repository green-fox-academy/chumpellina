import java.util.ArrayList;

public class BattleApp {
    ArrayList<Pirates> crewOne = new ArrayList<Pirates>();
    ArrayList<Pirates> crewTwo = new ArrayList<Pirates>();

    Ship shipOne = new Ship(crewOne);
    Ship shipTwo = new Ship(crewTwo);

    public void doBattle() {

    shipOne.battle(shipTwo);
}
}
