import java.util.HashSet;
import java.util.Set;

public class CollectionSetDemo2 {
//    如果希望Set集合认为2个内容相同的对象是重复的应该怎么办？
//    重写hashcode和equals方法
    public static void main(String[] args) {

        Set<Student> set = new HashSet<>();

        set.add(new Student("张三", 18, 175, "男"));
        set.add(new Student("张三", 18, 175, "男"));
        set.add(new Student("张三", 18, 175, "男"));
        set.add(new Student("张三", 18, 175, "男"));
        set.add(new Student("李四", 28, 170, "男"));
        set.add(new Student("李四", 28, 170, "男"));
        set.add(new Student("李四", 28, 170, "男"));

        for (Student student : set) {
            System.out.println(student);
        }
    }
}
