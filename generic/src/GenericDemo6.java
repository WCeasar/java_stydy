import java.util.ArrayList;

public class GenericDemo6 {
    public static void main(String[] args) {

        // 泛型不能使用基本数据类型

        // 把基本数据类型变成包装类
        // 手动包装
        Integer i = new Integer(100); //过时
        Integer j = Integer.valueOf(100); // 推荐使用

        // 自动装箱成对象: 基本数据类型的数据可以直接变成包装对象的数据,不需要额外做任何事情
        Integer i1 = 130;

        // 自动拆箱
        int i2 = i1;

        ArrayList<Integer> list = new ArrayList();

        list.add(1); // 自动包装
        list.add(1); // 自动包装

        // 包装类新增的功能
        // 1. 把基本类型的数据转成字符串
        int j1 = 23;
        String sj1 = Integer.toString(j1);
        System.out.println(sj1 + 1); // 231

        // 把字符串类型转换成对应的基本数据类型
        String str = "190";
        int i3 = Integer.parseInt(str);
        System.out.println(i3);

        int i4 = Integer.valueOf(str);
        System.out.println(i4);
    }
}
