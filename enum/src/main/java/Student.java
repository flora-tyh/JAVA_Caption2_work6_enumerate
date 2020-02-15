public class Student {
    private final String name;
    private final Sex sex;

    public Student(String name, Sex sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public Sex getSex() {
        return sex;
    }

    public void showStudent() {
        System.out.println("我是" + getName() + "，性别" + getSex().getValue());
    }
}
