//Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
public class Task2 {
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //ArrayIndexOutOfBoundsException
            for (int j = 0; j < 5; j++) {
                //NumberFormatException
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[][] array = {{"7", "1", "0", "r", "452"}, { "1", "4", "7"}};
        System.out.println(sum2d(array));
    }

}
