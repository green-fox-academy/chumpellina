import java.util.ArrayList;

public class Ship {
    private ArrayList<Pirates> crew = new ArrayList<Pirates>();
    private Pirates pirate = new Pirates(1, 1, "bla");
    private int numberOfAlivePirates;

    public ArrayList<Pirates> getCrew() {
        return crew;
    }

    public int getNumberOfAlivePirates() {
        return numberOfAlivePirates;
    }

    public void setNumberOfAlivePirates(int numberOfAlivePirates) {
        this.numberOfAlivePirates = numberOfAlivePirates;
    }

    public Ship(ArrayList<Pirates> crew) {
        this.crew = crew;
    }

    public void fillShip(ArrayList<Pirates> crew, Pirates pirate) {
        crew.add(pirate);
    }


    public String shipInformations(ArrayList<Pirates> x) {
        int rumAmount = captainRumAmount(x);
        String state = "";
        if (x.get(0).getDrunkenness() > 5) {
            state = "passed out";
        }
        if (x.get(0).getLifePoint() < 1) {
            state = "dead";
        } else state = "ok";

        int counter = alivePirateCounter(x);
        return "The Captain had " + rumAmount + " rums consumed and he is currently " + state + '\n' + "The number of Pirates alive in the crew: " + alivePirateCounter(x);
    }


    public int captainRumAmount(ArrayList<Pirates> x) {
        return x.get(0).getDrunkenness();
    }

    private int alivePirateCounter(ArrayList<Pirates> crewX) {
        int counter = 0;
        for (int i = 0; i < crewX.size(); i++) {
            if (crewX.get(i).getLifePoint() > 0) {
                counter += 1;
            }
        }
        setNumberOfAlivePirates(counter);
        return counter;
    }

    private int shipScoreCounter(Ship ship) {
        int score = ship.alivePirateCounter(this.crew) - this.crew.get(0).getDrunkenness();
        return score;
    }

    public void party(ArrayList<Pirates> crew) {
        for (int i = 0; i < crew.size(); i++) {
            crew.get(i).setDrunkenness((int) Math.random() * 10);
        }
    }

    public Boolean battle(Ship otherShip) {
        Boolean didWeWon = null;
        int scoreOurShip = this.shipScoreCounter(this);
        int scoreOtherShip = shipScoreCounter(otherShip);
        if (scoreOurShip > scoreOtherShip) {
            didWeWon = true;
            this.party(getCrew());

        }
        if (scoreOtherShip < scoreOurShip) {
            didWeWon = false;
            otherShip.party(getCrew());
        }
        otherShip.setNumberOfAlivePirates((int) Math.random() * 10);
        return didWeWon;
    }


}


