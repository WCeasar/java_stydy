public class GenericDemo4 {
    public static void main(String[] args) {
        String[] names = { "张三", "李四", "王五", "赵六", "田七", "钱八", "angle", "hello", "Rose", "Boss", "Andy" };

        Integer[] ages = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

        printArray(names);
        printArray2(ages);
        printArray2(names);
    }

    public static void printArray(String[] names) {

    }

    public static <T> void printArray2(T[] ages) {
        System.out.println(ages);
    }

    public static <T> T printArray3(T[] names) {
        return null;
    }
}
