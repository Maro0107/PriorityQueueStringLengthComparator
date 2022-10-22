import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<String> test = new PriorityQueue<>();

        test.add("Maciek");
        test.add("Piotr");
        test.add("Anna");
        test.add("Henryk");

        while (!test.isEmpty()){
            System.out.println(test.poll());
        }

        System.out.println("///////////////////////////////////");

        PriorityQueue<String> test1 = new PriorityQueue<>(new StringLengthComparator());

        test1.add("Maciek");
        test1.add("Piotr");
        test1.add("Anna");
        test1.add("Henryk");

        while (!test1.isEmpty()){
            System.out.println(test1.poll());
        }
    }
}
