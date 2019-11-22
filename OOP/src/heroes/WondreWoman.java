package heroes;

public class WondreWoman extends Hero {

    @Override
    public String toString() {
        return super.toString();
    }

    public WondreWoman(String name, int hp, int mana) {
        super(name, hp, mana);
    }

    @Override
    public void firePrimary() {
        mana -= 10;
        hp++;
    }

    @Override
    public void fireSecondary() {
        mana -= 30;
        hp += 3;
    }

    @Override
    public void receiveHit() {
        hp--;
    }
}
