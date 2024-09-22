interface Calculations {
    public double area();
    public double perimeter();
}
interface Correction {
    public double percent(double value);
}

// Square class implementing Calculations
class Square implements Calculations {
    public double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square[side=" + side + "]";
    }
}

// ResizedSquare class extending Square and implementing Correction
class ResizedSquare extends Square implements Correction {
    public ResizedSquare(double side) {
        super(side);
    }

    @Override
    public double percent(double value) {
        side = (side * value) / 100.0;
        return side;
    }
}

public class Main {
    public static void main(String[] args) {
        Square square = new Square(1.0);
        System.out.println(square);
        System.out.println("Area: " + square.area());
        System.out.println("Perimeter: " + square.perimeter());

        ResizedSquare resizedSquare = new ResizedSquare(2.0);
        System.out.println(resizedSquare);
        System.out.println("Area: " + resizedSquare.area());
        System.out.println("Perimeter: " + resizedSquare.perimeter());

        resizedSquare.percent(200);
        System.out.println("After resizing:");
        System.out.println("New Area: " + resizedSquare.area());
        System.out.println("New Perimeter: " + resizedSquare.perimeter());
    }
}