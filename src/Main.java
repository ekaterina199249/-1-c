import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3};
        System.out.println(Arrays.toString(numbers1));
        for (int i = 0; i < numbers1.length; i++) {
            if (i < numbers1.length)
                System.out.println(numbers1[i] + " ");
        }
        for (int i = numbers1.length - 1; i >= 0; i--) {
            if (numbers1[i] % 2 != 0) {
                numbers1[i] += 1;
            }
            System.out.print(numbers1[i] + ", ");
        }
        System.out.println();
        double[] numbers2 = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(numbers2));

        for (int i = 0; i < numbers2.length; i++) {
            if (i < numbers2.length)
                System.out.println(numbers2[i] + " ");
        }
        for (int i = numbers2.length - 1; i >= 0; i--) {
            if (numbers2[i] % 2 != 0)
                numbers2[i] += 1;
        }
        System.out.println(Arrays.toString(numbers2));

        System.out.println();
        int[] numbers3 = {5, 6, 10};
        System.out.println(Arrays.toString(numbers3));
        {

            for (int i = numbers3.length - 1; i >= 0; i--) {
                System.out.print(numbers3[i] + " ");

                if (numbers3[i] % 2 != 0)
                    numbers3[i] += 1;
                {


                        if (i < numbers3.length - 1)
                            System.out.println(numbers3[i] + ", ");
                        else {
                            System.out.println(numbers3[i] + " ");

                        }

                    }
                }
            }
        }
    }






