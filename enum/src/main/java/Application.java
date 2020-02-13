import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        Student stu1 = new Student("Linda", Sex.Male);
        Student stu2 = new Student("Bob", Sex.Female);
        Student stu3 = new Student("Solider", Sex.Male);
        Student stu4 = new Student("Cindy", Sex.Female);

        ArrayList<Student> students = new ArrayList<>();
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        students.add(stu4);

        for (Student stu : students) {
            if (isMale(stu)) {
                stu.showStudent();
            }
        }
    }

    public static Boolean isMale(Student stu) {
        return stu.getSex() == Sex.Male;
    }
}
