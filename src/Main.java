import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
    }

    public static void task1(){
        int[] integers = new int[3];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;
        double[] doubles = {1.57, 7.654, 9.986};
        int[] myArray = new int[10];

        for(int i = 0; i < 10; i++) myArray[i] = i;
    }

    public static void task2(){
        int[] integers = {1, 2, 3};
        double[] doubles = {1.57, 7.654, 9.986};
        int[] myArray = new int[10];
        int i;

        for(i = 0; i < 10; i++) myArray[i] = i;

        System.out.println("Task2:");
        for(i = 0; i < integers.length - 1; i++) System.out.printf("%d, ", integers[i]);
        System.out.printf("%d\n", integers[i]);

        for(i = 0; i < doubles.length - 1; i++) System.out.printf("%.3f, ", doubles[i]);
        System.out.printf("%.3f\n", doubles[i]);

        for(i = 0; i < myArray.length - 1; i++) System.out.printf("%d, ", myArray[i]);
        System.out.printf("%d\n", myArray[i]);
    }

    public static void task3(){
        int[] integers = {1, 2, 3};
        double[] doubles = {1.57, 7.654, 9.986};
        int[] myArray = new int[10];
        int i;

        for(i = 0; i < 10; i++) myArray[i] = i;

        System.out.println("Task3:");
        for(i = integers.length - 1; i > 0; i--) System.out.printf("%d, ", integers[i]);
        System.out.printf("%d\n", integers[0]);

        for(i = doubles.length - 1; i > 0; i--) System.out.printf("%.3f, ", doubles[i]);
        System.out.printf("%.3f\n", doubles[0]);

        for(i = myArray.length - 1; i > 0; i--) System.out.printf("%d, ", myArray[i]);
        System.out.printf("%d\n", myArray[0]);
    }
    public static void task4(){
        int[] integers = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Task4:");
        for (int i = 0; i < integers.length; i++) {
            if(integers[i] % 2 != 0) integers[i] += 1;
        }

        System.out.println(Arrays.toString(integers));
    }
}