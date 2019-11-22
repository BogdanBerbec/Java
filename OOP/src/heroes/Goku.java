package heroes;

public class Goku extends Hero {

    @Override
    public String toString() {
        return super.toString();
    }

    public Goku(String name, int hp, int mana) {
        super(name, hp, mana);
    }

    @Override
    public void firePrimary() {
        mana -= 5;
    }

    @Override
    public void fireSecondary() {
        mana -= 40;
    }

    @Override
    public void receiveHit() {
        hp -= 1;
        mana += 3;
    }
}
