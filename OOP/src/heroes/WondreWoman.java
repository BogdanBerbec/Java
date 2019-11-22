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
    public void firePrimary(Hero hero) {
        mana -= 10;
        hp++;
        hero.receiveHit(20);
    }

    @Override
    public void fireSecondary(Hero hero) {
        mana -= 30;
        hp += 3;
        hero.receiveHit(60);
    }

    @Override
    public void receiveHit(int power) {
        if (power < 25) {
            mana++;
        } else {
            hp -= power / 3;
        }
    }
}
