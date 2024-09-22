class Rectangle {
    int length;
    int breadth;

    Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    @Override
    public String toString() {
        // return "Rectangle[length= " + this.length + ", breadth= " + this.breadth + "]";
        // return getClass().descriptorString();
        // return getClass().getCanonicalName();
        return getClass().getName();
    }

}


public class inBuildExample {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(2, 5);

        System.out.println(rect1);
        // without toString Rectangle@3fee733d
        // with toString Rectangle[length= 2, breadth= 5]

        // getClass().descriptorString() => LRectangle;
        // getClass().getCanonicalName() => Rectangle

    }
}
