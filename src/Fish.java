public class  Fish  {
    private int age;
    private String name;
    private  String color;

    public Fish(int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }
    public Fish(){}
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}


