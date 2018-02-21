/*
 *  Number of each numeric
 *
 *  https://www.acmicpc.net/problem/2577
 */

import java.util.*;

public class BOJ_2577 {
    public static void main(String [] args) {
        BOJ_2577 main = new BOJ_2577();
        Scanner sc = new Scanner(System.in);
        int Mul = 1;
        for (int i = 0; i < 3; i++)
            Mul *= sc.nextInt();
        sc.close();
        int length = String.valueOf(Mul).length();
        int [] Arr = new int[length];
        int temp = 0;
        while (Mul > 0) {
            Arr[temp] = Mul % 10;
            Mul /= 10;
            temp++;
        }
        for (int i = 0; i < 10; i++)
            System.out.println(main.countNumberinArr(i, Arr));
    }
    public int countNumberinArr(int a, int [] Arr) {
        int count = 0;
        for (int temp : Arr) {
            if (a == temp)
                count++;
        }
        return count;
    }
}
