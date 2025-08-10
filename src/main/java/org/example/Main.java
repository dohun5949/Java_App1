package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("== 명언 앱 ==");
        Scanner sc = new Scanner(System.in);
        int num=1;
        while(true) {
            String s = sc.nextLine();
            if(s.equals("종료")){
                break;
            }
            else if(s.equals("등록")){
                System.out.printf("%d번 명언이 등록 되었습니다.",num);
                num++;
            }

        }
    }
}