package heroes;

public class Mage extends Hero {

    @Override
    public String toString() {
        return super.toString();
    }

    public Mage(String name, int hp, int mana) {
        super(name, hp, mana);
    }

    @Override
    public void firePrimary() {
        mana -= 15;
    }

    @Override
    public void fireSecondary() {
        mana -= 40;
    }

    @Override
    public void receiveHit() {
        hp -= 30;
    }
}
