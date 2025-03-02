import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers1 = {1, 2, 3};
        System.out.println(Arrays.toString(numbers1));

        for (int i = numbers1.length - 1; i >= 0; i--) {

            if (numbers1[i] % 2 != 0) {
                numbers1[i] += 1;
            }
            System.out.print(numbers1[i] + ", ");
        }
        System.out.println();
        double[] numbers2 = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(numbers2));

        for (int j = numbers2.length - 1; j >= 0; j--)

            if (numbers2[j] % 2 != 0) {
                numbers2[j] += 1;
            }
        {
            System.out.println(Arrays.toString(numbers2));
        }
        {
            System.out.println();
            int[] numbers3 = {5, 6, 10};
            System.out.println(Arrays.toString(numbers3));
            for (int k = numbers3.length - 1; k >= 0; k--) {
                System.out.print(numbers3[k] + ", ");
                if (numbers3[k] % 2 != 0) {
                    numbers3[k] += 1;
                }
            }


        }
    }
    }


