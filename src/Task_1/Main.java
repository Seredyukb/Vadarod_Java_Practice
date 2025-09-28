package Task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* 1. Дано уравнение: (10+12)*x=88;. Найти значение x.
                Наведите курсор на сообщение, чтобы закрепить его
        keep
        4. Введите x,y,z. К числу x прибавьте y, число y умножьте на z. Используйте операции присваивания.
                Результат выведите в косноль
        5. Дано уравнение 213/x+258/x+60=217. Вывести в консоль чему будет равен x
        6. Даны значения: x=5; y=2; c=x*y;
        6.2 Расставьте операции инкремента декремента так,  чтобы после выполнения операции (c=x*y) с=10; x=6; y=1

        1. Ввести числа a и b с консоли. Если a>b, то вывести разность (a-b) передав ее в новую переменную. Иначе если a=b  вывести сумму этих чисел.
        Иначе, вывести разность b-a. Результат вычисления передать в новую переменную.
        2. Ввести числа a и b с консоли. Если a>b и b не равно 0-вывести результат деления a на b.
                Иначе если a не равно 0, вывести b/a, Иначе вывести сумму чисел a и b.
        3. На вход дано число. Определить, делиться ли оно на три. Вывести соответствующий текст.
   */
        /*
         * 1. Дано уравнение: (10+12)*x=88;. Найти значение x.
         * */
        /*
        int x = 88 / (10 + 12);
        System.out.println(x);
        */
        /*
         * 4. Введите x,y,z. К числу x прибавьте y, число y умножьте на z. Используйте операции присваивания.
         * */
        /*
        Scanner in = new Scanner(System.in);
        int x, y, z;
        System.out.println("Введите x");
        x = in.nextInt();
        System.out.println("Введите y");
        y = in.nextInt();
        System.out.println("Введите z");
        z = in.nextInt();
        int c = x+y;
        int q = c*z;
        System.out.println(q);
        */

        /*
         * 5. Дано уравнение 213/x+258/x+60=217. Вывести в консоль чему будет равен x
         * */
        /*
        int x = (213 + 258) / (217 - 60);
        System.out.println(x);
        */

        /*
        6. Даны значения: x=5; y=2; c=x*y;
        6.2 Расставьте операции инкремента декремента так, чтобы
        после выполнения операции (c=x*y) с=10; x=6; y=1
        */
        /*int x = 5;
        int y = 2;
        int c = x*y;
        System.out.println(c);
        int z = x++*y--;
        System.out.println(z);
        System.out.println(x);
        System.out.println(y);
        */

        /*
        * 1. Ввести числа a и b с консоли. Если a>b, то вывести разность (a-b) передав ее в новую переменную.
        * Иначе если a=b  вывести сумму этих чисел.
        Иначе, вывести разность b-a. Результат вычисления передать в новую переменную.
        * */
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Введите a");
        int a = in.nextInt();
        System.out.println("Введите b");
        int b = in.nextInt();
        int c = 0;
        if (a > b) {
            c = a-b;
            System.out.println(c);
        } else if(a==b){
            c= a+b;
            System.out.println(c);
        } else{
            c= b-a;
            System.out.println(c);
        }
        */
        /*
        * 2. Ввести числа a и b с консоли. Если a>b и b не равно 0-вывести результат деления a на b.
             Иначе если a не равно 0, вывести b/a, Иначе вывести сумму чисел a и b.
        * */
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Введите a");
        int a = in.nextInt();
        System.out.println("Введите b");
        int b = in.nextInt();
        if (a > b && b!=0){
            System.out.println(a/b);
        }else if(a!=0){
            System.out.println(b/a);
        }else{
            System.out.println(a+b);
        }
        */
        /*
         * 3. На вход дано число. Определить, делиться ли оно на три. Вывести соответствующий текст.
         * */
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int a = in.nextInt();
        if (a % 3 == 0) {
            System.out.println("Число а делится на 3 без остатка и равно = " + a);
        } else {
            System.out.println("Число а не делится на 3 без остатка и равно = " + a);
        }
        */
    }
}
