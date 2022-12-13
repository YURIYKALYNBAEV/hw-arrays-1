import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {

        System.out.println("Задача №1");

        int [] arrayOne = new int[]{1, 2, 3};
        float [] arrayTwo = {1.57f, 7.654f, 9.986f};
        int [] arrayThree = {100, 99, 98, 97, 96};

        System.out.println();

    }

    public static void task2() {

        System.out.println("Задача №2");

        int [] arrayOne = new int[]{1, 2, 3};
        float [] arrayTwo = {1.57f, 7.654f, 9.986f};
        int [] arrayThree = {100, 99, 98, 97, 96};

        for (int i = 0; i < arrayOne.length; i++) {
            System.out.print(arrayOne[i] + ", ");
        }

        System.out.println();

        for (int i = 0; i < arrayTwo.length; i++) {
            System.out.print(arrayTwo[i] + ", ");
        }

        System.out.println();

        for (int i = 0; i < arrayThree.length; i++) {
            System.out.print(arrayThree[i] + ", ");
        }

        System.out.println();

    }

    public static void task3() {

        System.out.println("Задача №3");

        int [] arrayOne = new int[]{1, 2, 3};
        float [] arrayTwo = {1.57f, 7.654f, 9.986f};
        int [] arrayThree = {100, 99, 98, 97, 96};


        for (int i = arrayOne.length - 1; i >= 0; i--) {
            System.out.print(arrayOne[i] + ", ");
        }

        System.out.println();

        for (int i = arrayTwo.length - 1; i >= 0; i--) {
            System.out.print(arrayTwo[i] + ", ");
        }

        System.out.println();

        for (int i = arrayThree.length - 1; i >= 0; i--) {
            System.out.print(arrayThree[i] + ", ");
        }


        System.out.println();

    }

    public static void task4() {

        System.out.println("Задача №4");

        int [] arrayOne = new int[]{1, 2, 3};

        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] % 2 != 0) {
                arrayOne[i]++;
            }
        }

        System.out.println(Arrays.toString(arrayOne));

    }
}