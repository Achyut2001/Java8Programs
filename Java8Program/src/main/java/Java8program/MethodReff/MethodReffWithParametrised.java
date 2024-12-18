package Java8program.MethodReff;

public class MethodReffWithParametrised {
    public static void main(String[] args) {

        functionalInterface i = Student::new;
        Student student = i.show(1, "Achyut", 1200.00);
        System.out.println(student);
    }
}
