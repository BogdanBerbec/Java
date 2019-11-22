public class Dog {
    int size;
    private int times;
    private String sound;

    public void bark(int times) {
        if (size>60) {
            bark(times, "Woof!");
        } else if (size>14) {
            bark(times, "Ruff!");
        } else {
            bark(times, "Yip!");
        }
    }

    public void bark(int times, String sound) {
        this.times = times;
        this.sound = sound;
        for (int i=0; i<times; i++) {
            System.out.println(sound);
        }
    }
}
