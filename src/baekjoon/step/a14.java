package baekjoon.step;

import java.util.Scanner;

public class a14 {
    public static void main(String[] args) {
        //9093번 문제 : 단어 뒤집기

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArray = str.split(" ");
        if(!("2".equals(str))){//숫자 2를 어떻게 예외처리 해야할지 애매
            for(String s : strArray){
                StringBuffer sb = new StringBuffer(s);
                String reversedStr = sb.reverse().toString();
                System.out.print(sb + " ");
            }
        }
    }
}
