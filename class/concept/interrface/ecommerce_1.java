package concept.interrface;

public class ecommerce_1 implements ecommerce { // here override krna pdega to remove error

    @Override
    public void Add() {
        System.out.println("ecomm 1 add");
    }
    @Override
    public void Remove() {
        System.out.println("ecomm 1 remove");
    }

    // int a = 30;

    public ecommerce_1() {
        System.out.println("this is ecomm 1");
    }
}
