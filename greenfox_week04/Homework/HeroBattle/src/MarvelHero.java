public class MarvelHero extends Hero {
    MarvelHero(String name) {
        super(name);
        setMotivation(40);
    }

    public MarvelHero(String name, int motivation) {
        super(name, motivation);
    }

    @Override
    public void punch(Punchable other) {
        if (getMotivationLevel() >= 1 && other.getClass() == DCHero.class) {
            other.bePunched(motivation / 1.5);
        }
    }

}
