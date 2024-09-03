import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTraversalTest6 {

    public static void main(String[] args) {
        // 1,迭代器遍历
        ArrayList<String> names = new ArrayList();
        names.add("张三");
        names.add("李四枸杞");
        names.add("王五枸杞");
        names.add("赵六");
        names.add("田七枸杞");
        names.add("钱八枸杞");
        names.add("angle");
        names.add("hello枸杞");
        names.add("Rose");
        names.add("Boss");


        // 遍历时的并发删除问题
////        1. for循环, 每次遍历遇到--
//        for (int i = 0; i < names.size(); i++) {
//            if(names.get(i).contains("枸杞")){
//                names.remove(i);
//                i --;
//            }
//        }
//        System.out.println(names);

//        2.
//        for (int i = names.size() - 1; i >= 0; i--) {
//            if(names.get(i).contains("枸杞")){
//                names.remove(i);
//            }
//        }

        System.out.println(names);

//        3. 调用迭代器的remove方法
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.contains("枸杞")) {
                iterator.remove();
            }
        }
        System.out.println(names);

//        4. 增强for循环和lambda不能解决
    }
}
