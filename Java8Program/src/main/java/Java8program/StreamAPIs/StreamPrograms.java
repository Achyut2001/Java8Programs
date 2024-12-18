package Java8program.StreamAPIs;

import java.awt.image.ImageProducer;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPrograms {
    public static void main(String[] args) {
        List<String> student = new ArrayList<>();
        student.add("Ketan");
        student.add("Chetan");
        student.add("Govind");
        student.add("Krishan");


        /*Creating Stream*/
        //    student.stream().forEach(System.out::println);

        /* Filter*/
        System.out.println("After filter list");
        student.stream().filter((String s) -> s.length() >= 3).forEach(System.out::println);
        System.out.println("Original list ");
        System.out.println(student);


        /*map*/
        //find length of string
        student.stream().map(String::length).forEach(System.out::println);


        /*distinct*/

        //find unique  element
        System.out.println("************************************");
        student.stream().distinct().forEach(System.out::println);


        /*Sorted*/
        System.out.println("Sorted List");
        List sortedlist = student.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedlist);



        /*Limit*/
        System.out.println("Limited the list");
        student.stream().sorted().limit(3).forEach(System.out::println);

        /*Skip*/
        System.out.println("Skip the 2 element");
        student.stream().skip(2).forEach(System.out::println);

        /*comparator*/
        System.out.println("Sorting using comparator");
        student.stream().sorted((String s1, String s2) -> s1.length() - s2.length()).forEach(System.out::println);



        /*Min*/
        System.out.println("Finding min element");
        System.out.println("Minimum element in given list is:");
        OptionalInt min = Arrays.stream(new int[]{7, 5, 9, 2, 8,}).min();
        System.out.println(min);

        /*Max*/
        System.out.println("Max element in given list is:");
        OptionalInt max = Arrays.stream(new int[]{7, 5, 9, 2, 8,}).max();
        System.out.println(max);



        /*Count*/
        System.out.println("Count the element which has length is > than 5");
        long count = student.stream().filter((String name) -> name.length() > 5).count();
        System.out.println(count);

        /*  */
        System.out.println("/////////////////////////");
        List<String> name = new ArrayList<>();
        name.add("java");
        name.add("Python");
        name.add("c#");
        name.add("c++");
        System.out.println(name);
        name.stream().forEach((s -> System.out.println(s)));
        Stream.of("c", "Kotilen");

        List<Integer> numbers = new ArrayList();
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        numbers.add(16);
        numbers.add(13);
       /* Finding odd and even number */
        List<Integer> evenNumber = numbers.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even Number" + evenNumber);

        List<Integer> oddNumber = numbers.stream()
                .filter(i -> i % 2 != 0)
                .collect(Collectors.toList());
        System.out.println("Odd Number " + oddNumber);


    }
}
