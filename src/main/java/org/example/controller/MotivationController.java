package org.example.controller;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

import org.example.Sayings;

public class MotivationController {
    private Scanner sc;
    private int lastid = 0;
    private List<Sayings> lst = new ArrayList<>();

    public MotivationController(Scanner sc) {
        this.sc = sc;
    }

    public void add(Scanner sc) {
        System.out.print("명언 : ");
        String motivation = sc.nextLine().trim();
        System.out.print("저자 : ");
        String author = sc.nextLine().trim();
        lastid++;
        Sayings s = new Sayings(lastid, motivation, author);
        lst.add(s);
        System.out.println(lastid + "번 명언이 등록되었습니다.");
    }

    public void list() {
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

    public void delete(String cmd) {
        String[] str = cmd.split(" ");
        if (str.length > 2) {
            System.out.println("delete 뒤에는 숫자만 입력 가능합니다.1");
            return;
        }
        int n;
        try {

            n = Integer.parseInt(cmd.split(" ")[1]);
        } catch (NumberFormatException e) {
            System.out.println("delete 뒤에는 숫자만 입력 가능합니다.2");
            return;
        }
        catch(IndexOutOfBoundsException ie){
            System.out.println("delete 한 칸 띄고 숫자 입력하십시오.");
            return;
        }
        int idx = -1;
        Sayings s = null;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i).getId() == n) {
                idx = i;
            }
        }

        if (idx != -1) {
            lst.remove(idx);
            System.out.println(n + "번 글이 삭제되었습니다.");
        }
        else if (!lst.contains(idx)) {
            System.out.println(n + "번 글이 없습니다.");
        }
//        lst.remove(idx);

    }
}
