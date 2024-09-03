import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTraversalDemo4 {

    public static void main(String[] args) {
        // 1,迭代器遍历
        Collection<String> names = new ArrayList();
        names.add("张三");
        names.add("李四");
        names.add("王五");
        names.add("赵六");
        names.add("田七");
        names.add("钱八");
        names.add("angle");
        names.add("hello");
        names.add("Rose");
        names.add("Boss");

       // 增强for遍历集合,本质上是可以用来遍历数组或者集合
        for (String name: names
             ) {
            System.out.println(name);
        }
    }
}
