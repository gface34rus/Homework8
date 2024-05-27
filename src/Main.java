import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] arrayInt = new int[3];
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;
        double[] arrayDouble = {1.57, 7.654, 9.986};
        boolean[] arrayBoolean = {true, false};
        System.out.println();
        System.out.println("Задача 2");
        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayDouble));
        System.out.println(Arrays.toString(arrayBoolean));
        System.out.println();
        System.out.println("Задача 3");
        System.out.println(arrayInt[2] + "," + arrayInt[1] + "," + arrayInt[0] + ".");
        System.out.println(arrayDouble[2] + "," + arrayDouble[1] + "," + arrayDouble[0] + ".");
        System.out.println(arrayBoolean[1] + "," + arrayBoolean[0] + ".");
        System.out.println();
        System.out.println("Задача 4");
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] % 2 != 0) {
                arrayInt[i]++;
            }
        }
        System.out.println(Arrays.toString(arrayInt));
    }
}