import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class MyStack<E> {
    private List<E> elements = new ArrayList<>();

    public void push(E element) {
        elements.add(element);
    }

    public E pop() {
        if (elements.isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.remove(elements.size() - 1);
    }

    public E peek() {
        if (elements.isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.get(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }

    @Override
    public String toString() {
        return elements.toString();
    }

    public static void main(String[] args) {
        MyStack<Integer> integerStack = new MyStack<>();
        integerStack.push(10);
        integerStack.push(20);
        System.out.println(integerStack); // Output: [10, 20]
        System.out.println(integerStack.pop()); // Output: 20
        System.out.println(integerStack); // Output: [10]

        MyStack<String> stringStack = new MyStack<>();
        stringStack.push("Hello");
        stringStack.push("World");
        System.out.println(stringStack); // Output: [Hello, World]
        System.out.println(stringStack.pop()); // Output: World
        System.out.println(stringStack); // Output: [Hello]
    }
}