/**Если необходимо, исправьте данный код:
try {
    int d = 0;
    double catchedRes1 = intArray[8] / d;
    System.out.println("catchedRes1 = " + catchedRes1);
  } catch (ArithmeticException e) {
     System.out.println("Catching exception: " + e);
  }*/
public class Task_s2_2 {
    public static void main(String[] args) {
        try {
            int[] intArray = { 4, 2, 5, 78, 22, 13, 6, 9, 24 }; // Объявил массив
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}