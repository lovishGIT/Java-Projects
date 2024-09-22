package lecollection;

import java.util.Stack;

public class stackLearn {
    public static void main(String[] args) {
        // Implementation Class of Least Interface

        Stack<Integer> st = new Stack<Integer>();
        st.add(20);
        st.add(10);
        st.add(20);
        st.add(30);
        System.out.println(st);
        System.out.println(st.firstElement());
        System.out.println(st.lastElement());

        st.pop();
        System.out.println(st);
        System.out.println(st.elementAt(1));
    }
}
