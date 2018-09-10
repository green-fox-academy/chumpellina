public class DCHero extends Hero {

    DCHero(String name) {
        super(name);
        setMotivation(45);
    }

    public DCHero(String name, int motivation) {
        super(name, motivation);
    }

    @Override
    public void punch(Punchable other) {
        if (getMotivationLevel() >= 1 && other.getClass() == MarvelHero.class) {
            other.bePunched(motivation/ 1.5);
        }
    }
}
