public class Hero extends BaseHero implements Punchable {
    protected int motivation;

    Hero(String name, int motivation) {
        super(name);
        this.motivation = motivation;
    }

    public Hero(String name) {
        super(name);
    }

    public void setMotivation(int motivation) {
        this.motivation = motivation;
    }




    @Override
    public void punch(Punchable other) {
        if (getMotivationLevel() >= 1) {
            other.bePunched(motivation / 1.5);
        }
    }

    @Override
    public int getMotivationLevel() {
        int motivationLevel = 0;
        if (motivation < 25) {
            motivationLevel = 0;
        } else if (motivation >= 25 && motivation < 40) {
            motivationLevel = 1;
        } else {
            motivationLevel = 2;
        }
        return motivationLevel;
    }

    @Override
    public void bePunched(double damage) {
        motivation = motivation - (int) (damage / motivation);
    }

    public String toString() {
        String status = "";
        if (getMotivationLevel() == 0) {
            return getName() + " is not motivated anymore";
        }
        if (getMotivationLevel() == 1) {
            return getName() + " is motivated";
        }
        if (getMotivationLevel() == 2) {
            return getName() + " is well motivated";
        }
        return status;
    }
}
