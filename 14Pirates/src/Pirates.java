public class Pirates {
    private int drunkenness;
    private int lifePoint;
    private String name;
    Parrot parrot = new Parrot("Bubbles");

    public int getDrunkenness() {
        return drunkenness;
    }

    public Pirates(int drunkenness, int lifePoint, String name) {
        this.drunkenness = drunkenness;
        this.lifePoint = lifePoint;
        this.name = name;
    }

    public void setDrunkenness(int drunkenness) {
        this.drunkenness = drunkenness;
    }

    public void setLifePoint(int lifePoint) {
        this.lifePoint = lifePoint;
    }

    public int getLifePoint() {
        return lifePoint;
    }

    public String drinkSomeRum() {
        if (lifePoint < 1) return "He is dead";
        else drunkenness += 1;
        return String.valueOf(drunkenness);
    }

    public String howsItGoingMate(int drunkenness) {
        int y = drunkenness;
        String z = "";
        if (lifePoint < 1) return z = "He is dead";
        else if (drunkenness < 5) return z = "Pour me anudder";
        else if (drunkenness >= 5) {
            return z = "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
        }
        return z;
    }


    public void die(int lifePoint) {
        setLifePoint(0);
    }

    public String state(Pirates x) {
        String z = "";
        if (drunkenness > 5) z = " is currently passed out";
        if (lifePoint == 0) z = " is dead";
        return z;

    }

    public void brawl() {

    }


}






/*die() - this kills off the pirate, in which case, drinkSomeRum, etc. just result in he's dead.
brawl(x) - where pirate fights another pirate (if that other pirate is alive) and there's a 1/3 chance, 1 dies, the other dies or they both pass out.
And... if you get that far...

Add a parrot.*/
