package concept.abstraction;

public class abstracttion extends abstractDemo {
    @Override
    public void Payment() {
        System.out.println("We can pay");
    }

    @Override
    public void ViewBallence() {
        System.out.println("We can check balance");
    }

    @Override // either @override or add parameter
    public void ShowItems() {
        System.out.println("We can show items");
    }

    public abstracttion() {
        // super(); // calls constructor of parent class
        // by default // so no need to write
        System.out.println("this is abstracttion constructor");
        // now lets say ki humne super keyword call krwaya
        // upper krwaya to default vala scene hogya
        // super(); // here it gives error because super keyword has to be mentionned at begainning

        super.ShowItems(); // super yani parent ka ShowItems
        this.ShowItems(); // this is abstracttion class ka ShowItems
    }
}
