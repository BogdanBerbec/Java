public class Program {
    public static void main(String[] args) {
//        Hours.NUMBER_OF_HOURS_IN_A_DAY

//        Day.MARTI
//        Day.values()

        Person alex = new Person("Alexandru", 20, 175, 10);
        Student mihai = new Student("Mihai", 23, 185, 110, "B");

        System.out.println(alex.getName() + " are " + alex.getAge() + " de ani");

        Person andrei = new Student("Andrei", 25, 180, 100, "A");

        andrei.grow(10);

        if (andrei instanceof Person) {
            System.out.println(andrei.getName() + " este persoana");
        }

        Student s = (Student) andrei;
        System.out.println(andrei.getHeight());
        System.out.println(andrei.toString());

        alex.run();
        alex.run();
        alex.run();
        System.out.println(alex.getName() + " are energia " + alex.getStamina());
        alex.sleep();
        System.out.println(alex.getName() + " are energia " + alex.getStamina());

        if (alex.isMajor()) {
            System.out.println(alex.getName() + " drinks beer");
        }
        System.out.println(alex.whatsYourName());

        Dog lessie = new Dog();
        lessie.size = 20;
        lessie.bark(3, "Ruff");
    }
}
