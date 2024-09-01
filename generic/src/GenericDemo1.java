import java.util.ArrayList;

public class GenericDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("1");
        list.add("2");
//        list.add(1);
//        list.add(new Object());

        String str = list.get(1); // 不用泛型可能会出现类型转换异常异常
    }

}
