
public class String_Buffer {
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer();
        // StringBuffer mutable and thread safe
        System.out.println(str1.capacity());// initial capacity 16 charactars
        StringBuffer str2 = new StringBuffer(50);
        System.out.println(str2.capacity());
        StringBuffer str3 = new StringBuffer("hello");
        System.out.println(str3);
        // method of String Buffer
        StringBuffer s = new StringBuffer("hello");
        StringBuffer sc = s.append("word");// it add in existing string
        s.insert(5, "bye");// Specified index पर String को insert करता है।
        System.out.println(s);
        s.replace(0, 5, "is");
        System.out.println(s);
        s.delete(0, 5);
        System.out.println(s);
        s.reverse();
        System.out.println(s);
        StringBuffer sc1 = new StringBuffer("hello");
        StringBuffer sc2 = sc1.append("byy");
        System.out.println(sc1 == sc2);
        StringBuffer sc3 = new StringBuffer("hello");
        System.out.println(sc1.equals(sc3));

    }
}