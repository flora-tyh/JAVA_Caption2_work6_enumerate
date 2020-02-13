public class Student {
    private String name;
    private Sex sex;

    public Student(String name, Sex sex) {
        this.name = name;
        this.sex = sex;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void showStudent() {
        System.out.println("我是" + getName() + "，性别" + getSex().getValue());
    }
}
