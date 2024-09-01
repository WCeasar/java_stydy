import java.util.ArrayList;

public class GenericDemo5 {
    public static void main(String[] args) {
        ArrayList<Xiaomi> a1 = new ArrayList();
        a1.add(new Xiaomi());
        go(a1);

        ArrayList<LX> a2 = new ArrayList();
        a2.add(new LX());
        go(a2);

        ArrayList<Dog> a3 = new ArrayList();
        a3.add(new Dog());
//        go(a3); // error
    }

    public static  void go(ArrayList<? extends Car> car) {
        System.out.println(car);
    }
}
