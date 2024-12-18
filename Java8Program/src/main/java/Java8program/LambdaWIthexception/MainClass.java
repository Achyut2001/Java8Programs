package Java8program.LambdaWIthexception;
import java.util.Arrays;
import java.util.List;


public class MainClass {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(3, 9, 7, 0, 10, 20);
        integers.forEach (i -> {
                    try {
                        System.out.println(12 / i);
                    } catch (ArithmeticException exception) {
                        System.out.println("Cant divide by zero"+exception.getMessage());
                    }
                }
        );
    }
}
