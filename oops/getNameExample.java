class OuterClass {
    class InnerClass {
    }
}

public class getNameExample {
    public static void main(String[] args) {
        Class<?> outerClass = OuterClass.class;
        Class<?> innerClass = OuterClass.InnerClass.class;
        Class<?> arrayClass = int[].class;

        System.out.println(outerClass.getName()); // Output: OuterClass
        System.out.println(innerClass.getName()); // Output: OuterClass$InnerClass
        System.out.println(arrayClass.getName()); // Output: [I
        
        System.out.println();

        System.out.println(outerClass.getCanonicalName()); // Output: OuterClass
        System.out.println(innerClass.getCanonicalName()); // Output: OuterClass.InnerClass
        System.out.println(arrayClass.getCanonicalName()); // Output: int[]
    }
}
