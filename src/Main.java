public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.setName("Simba");
        fish.setAge(6);
        fish.setColor("Gray");
        Cat cat = new Cat();
        cat.setName("Tuzik");
        cat.setAge(6);
        cat.setColor("White");
        Parrot parrot = new Parrot();
        parrot.setName("Alfa");
        parrot.setAge(4);
        parrot.setColor("Colorful");
        System.out.println(parrot.toString());
        System.out.println(fish.toString());
        System.out.println(cat.toString());


    }
}