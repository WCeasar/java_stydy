import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTraversalDemo3 {

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

        // 1.得到这个集合的迭代器对象
        Iterator<String> it = names.iterator();
        while(it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }

    }
}
