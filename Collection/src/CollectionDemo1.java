import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionDemo1 {
    // 单列集合
    public static void main(String[] args) {
        List<String> list = new ArrayList(); // 有序 可重复 有索引
        list.add("Java");
        list.add("Java");
        System.out.println(list); // [Java, Java]

        Set<String> set = new HashSet(); // 无序 不可重复 无索引
        set.add("Java");
        set.add("Java");
        System.out.println(set); // [Java]

    }
}
