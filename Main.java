package Com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!isPowerOfTwo(arr[i])) {
                sum += arr[i];
                count++;
            }
        }
        int avg = sum / count;
        System.out.println(avg);
    }

    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0 && n != 0;
    }
}

