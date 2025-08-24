package org.example.controller;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

import org.example.Sayings;

public class MotivationController {
    private Scanner sc;
    private static int lastid = 0;
    private static List<Sayings> lst = new ArrayList<>();

    public MotivationController(Scanner sc){
        this.sc =sc;
    }
    public static void add(Scanner sc) {
        System.out.print("명언 : ");
        String motivation = sc.nextLine().trim();
        System.out.print("저자 : ");
        String author = sc.nextLine().trim();
        lastid++;
        Sayings s = new Sayings(lastid, motivation, author);
        lst.add(s);
        System.out.println(lastid + "번 명언이 등록되었습니다.");
    }

    public static void list() {
        System.out.println("=".repeat(20));
        System.out.println("번호  저자  명언 ");
        if (lst.size() == 0) {
            System.out.println("등록된 명언이 없습니다.");
        } else {
//                    Collections.reverse(lst);
            for (int i = lst.size() - 1; i >= 0; --i) {
                Sayings s = lst.get(i);
                if (s.getSaying().length() >= 5) {
                    System.out.println(s.getId() + "  " + s.getAuthor() + "   " + s.getSaying().substring(0, 5) + ". . .");
                } else {
                    System.out.println(s.getId() + "  " + s.getAuthor() + "   " + s.getSaying());
                }
            }
        }
    }
}
