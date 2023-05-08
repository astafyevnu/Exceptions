// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
public class Task1 {

    public static void exception_1() {
        int[] array = new int[-1];
    }
    public static void exception_2() {
        int a;
        int[] array = new int[]{0, 1, 23, 5, 4, 6, 7};
        a = array[array.length];
    }
    public static void exception_3() {
        int a = 2;
        int b = 0;
        int c;
        c = a / b;
    }

    public static void main(String[] args) {

        System.out.println("Exception 1");
        exception_1();

        System.out.println("Exception 2");
        exception_2();

        System.out.println("Exception 3");
        exception_3();

    }
}
