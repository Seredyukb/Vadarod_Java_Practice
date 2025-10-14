package Task_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
/**\
 * 1. Необходимо, чтобы программа отображала следующую последовательность чисел:
 * 7 14 21 28 35 42 49 56 63 70 77 84 91 98
 * 2. Необходимо вывести следующую последовательность цифр:
 * 1 2 4 8 16 32 64 128 256 512
 * 3. Написать программу, которая посчитает сумму первых 10 чисел
 * 4. Вывести числа от 100 до 1 через запятую. В конце не должно быть запятой
 * 5. Вывести числа от 1 до 100.
 * 8. Создать массив из чисел. Вывести макс и мин число.
 */
        /* * 1. Необходимо, чтобы программа отображала следующую последовательность чисел:
         * 7 14 21 28 35 42 49 56 63 70 77 84 91 98
         * */
        /*
        int i;
        for (i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
        int q = 0;
        while (q < 98) {
            q += 7;
            System.out.println(q);
        }
        */
        /**
         * * 2. Необходимо вывести следующую последовательность цифр:
         *  * 1 2 4 8 16 32 64 128 256 512
         */
        /*
        int z;
        for (z = 1; z <= 512; z *= 2) {
            System.out.println(z);
        }
        int y = 1;
        while (y < 512) {
            y *= 2;
            System.out.println(y);
        }
*/
        /*
         *  * 3. Написать программу, которая посчитает сумму первых 10 чисел
         * */
        /*
        int sum = 0;
        int array1[] = {1, 2, 4, 5, 7, 7, 4, 4, 7, 7, 4, 4, 7, 8, 10};
        for (int s = 0; s < 10; s++) {
            sum += array1[s];
        }
        System.out.println(sum);

        int val1 = 10;
        int val2 = 135;
        int result = 0;
        while (val1 <= val2) {
            if (val1 == val1 + 10) {
                result += val1;
                val1++;
                break;
            }
        }
        System.out.println(result);
*/
        /*
         *  * 4. Вывести числа от 100 до 1 через запятую. В конце не должно быть запятой
         * */
        /*
        int valS = 100;

        int valL = 1;
        String resultS = "";

        while (valS > 0) {
            if (valS > 1) {
                resultS = valS + ",";
            } else {
                resultS = valS + "";
            }

            System.out.print(resultS);

            valS--;
        }
        */
        /*
         * * 5. Вывести числа от 1 до 100.
         * */
        /*int b = 1;
        while (b <= 100) {
            System.out.println(b);
            b++;
        }
        */
        /*
         * 8. Создать массив из чисел. Вывести макс и мин число.
         * */
        int array[] = {1, 2, 4, 6, 587, 34, 67, 43, 34, 34, 56, 78, 99};
        Arrays.sort(array);
        System.out.println("Максимальное число в массиве " + array[array.length - 1]);
        System.out.println("Минимальное число в массиве " + array[0]);

    }
}
