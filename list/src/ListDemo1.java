import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
//        arraylist底层是基于数组存储数据的,查询较快,增删较慢
//        linkedList底层是基于双链表存储数据的,查询较慢，增删相对较快,
//         linkedList 设计了很多首尾数据方法

        List<String> list = new ArrayList();

//        利用LinkedList模拟队列
//        不能使用多态,用了多态就不能使用LinkedList独有的方法
        LinkedList<String> queue = new LinkedList();
        queue.addFirst("赵敏");
        queue.addFirst("貂蝉");
        queue.addFirst("周芷若");
        System.out.println(queue);

        System.out.println(queue.removeLast());
        System.out.println(queue.removeLast());
        System.out.println(queue.removeLast());

        // 利用linkedList模拟栈 先进后出

        LinkedList<String> stack = new LinkedList<>();
        stack.push("赵敏");
        stack.push("貂蝉");
        stack.push("周芷若");
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
