package Java8program;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;


interface addation {
    void add(int i, int i1);
}

interface Square {
    int sqcl(int aa);
}

interface car{
    void run();
}
interface student {
    void study();
}

public class LambdaExpression {
    public static void main(String[] args) {
         /*1.Addation */
      /*   add = (int a, int b) -> {
            int c = a + b;
            System.out.println(c);
        };
        add.add(12, 34);

        *//* 2.implementing runnable interface method*//*
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread");
            }
        };
        Thread t = new Thread(runnable);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }

        *//* 3.implementing square interface*//*
        Square squre = (int a) -> {
            int c = a * a;
            System.out.println(c);
            return c;
        };
        squre.sqcl(12);


        *//* 4.lambda expression with functional -predicate method*//*
        Predicate<Integer> lessThan=i ->(i>18);
        System.out.println(lessThan.test(23));
*/
          /* 5.sorting arraylist by using lambda ex*/
        List<Integer> al = new ArrayList<Integer>();
        al.add(205);
        al.add(102);
        al.add(98);
        al.add(275);
        al.add(203);
        System.out.println("Elements of the ArrayList " +
                "before sorting : " + al);


        Collections.sort(al, (o1, o2) -> (o1 > o2) ? 1 :
                (o1 < o2) ? -1 : 0);

        System.out.println("Elements of the ArrayList after" +
                " sorting : " + al);

       /*6. Check string is empty or not*/
        Predicate<String> str=(i)->i.isEmpty();
        System.out.println(str.test("Tdit"));

        Predicate<String>str1=(i)->i.isEmpty();
        System.out.println(str1.test(""));



        /*7.Car interface implementing*/
         car c=()-> System.out.println("The car running fast");
         c.run();


         /*8.  */

         student student=()-> System.out.println("Student is studying");
          student.study();
    }
}
