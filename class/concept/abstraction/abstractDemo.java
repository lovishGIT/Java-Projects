package concept.abstraction;

public abstract class abstractDemo {
    public abstract void Payment();

    public abstract void ViewBallence();

    public void ShowItems() {
        System.out.println("hello show items");
    }

    public abstractDemo() {
        System.out.println("this is abstract demo constructor");
    }
}
