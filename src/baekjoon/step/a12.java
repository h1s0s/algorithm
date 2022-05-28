package baekjoon.step;

import java.util.Scanner;

public class a12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if(m >= 45){
            System.out.print(h + " " + (m-45));
        } else if (h != 0) {
            int a = 45-m;
            m = 60;
            System.out.print(--h + " " + (m-a));
        } else {
            h = 23;
            int a = 45-m;
            m = 60;
            System.out.print(h + " " + (m-a));
        }
    }
}
