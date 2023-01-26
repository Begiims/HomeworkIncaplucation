public class Parrot {
    private  String name;
    private  int age;
    private  String color;

    public Parrot(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public Parrot(){}

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
