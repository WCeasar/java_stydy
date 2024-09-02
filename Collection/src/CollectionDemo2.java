import java.util.ArrayList;
import java.util.Collection;
import java.util.function.IntFunction;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList();

        list.add("Java");
        list.add("Java1");
        System.out.println(list);

        list.remove("Java");
        System.out.println(list);

        System.out.println(list.isEmpty());;
        System.out.println(list.size());;

//        list.clear();
        System.out.println(list);

        // 判断集合是否包含某个数据
        System.out.println(list.contains("Java"));

        Object[] arr = list.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 用String数组接
//        String[] arr2 = list.toArray(new IntFunction<String[]>() {
//            @Override
//            public String[] apply(int value) {
//                return new String[0];
//            }
//        });

//        String[] arr2 = list.toArray(value -> new String[0]);

        String[] arr2 = list.toArray(String[]::new);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
