import java.util.ArrayDeque;
import java.util.Queue;

public class bt11 {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("a");
        queue.add("b");
        queue.offer("c");
        queue.offer("d");

        System.out.println(queue.poll());
        System.out.println(queue.poll());

        while (!queue.isEmpty()) {
            String element = queue.poll();
            System.out.println(element);
        }

    }
}
