package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private Scanner sc;
    private List<Sayings> lst = new ArrayList<>();
    int lastid=0;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {

        System.out.println("== 명언 앱 ==");

        while (true) {
            System.out.print("명령어) ");
            String cmd = sc.nextLine().trim(); //trim 좌우 공백제거

            if (cmd.equals("exit")) {
                System.out.println("********* 프로그램 종료 *********");
                break;
            }
            else if(cmd.equals("add")){
                System.out.print("명언 : ");
                String motivation = sc.nextLine().trim();
                System.out.print("저자 : ");
                String author = sc.nextLine().trim();
                lastid++;
                Sayings s = new Sayings(lastid,motivation, author);
                lst.add(s);
                System.out.println(lastid + "번 명언이 등록되었습니다.");
            }
            else if(cmd.equals("list")){
                System.out.println("=".repeat(20));
                System.out.println("번호  저자  명언 ");
                if(lst.size() == 0){
                    System.out.println("등록된 명언이 없습니다.");
                }else {
                    for (int i = 0; i < lst.size(); i++) {
                        Sayings s = lst.get(i);
                        System.out.println(s.getId() + "  " + s.getAuthor() + "   " + s.getSaying());
                    }
                }
            }
            else if(cmd.equals("delete")){
                int n = sc.nextInt();
                
            }
            else  {
                System.out.println("사용할 수 없는 명령어입니다.");
            }
        }

    }

}

