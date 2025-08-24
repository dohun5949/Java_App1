package org.example;

import org.example.controller.MotivationController;
import org.example.system.SystemController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;


public class App {

    private Scanner sc;


    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        SystemController systemController = new SystemController();
        MotivationController motivationController = new MotivationController(sc);
        System.out.println("== 명언 앱 ==");

        while (true) {
            System.out.print("명령어) ");
            String cmd = sc.nextLine().trim(); //trim 좌우 공백제거

            if (cmd.equals("exit")) {
                systemController.exit();
                break;
            } else if (cmd.equals("add")) {
                motivationController.add(sc);

            } else if (cmd.equals("list")) {
                motivationController.list();

            } else if (cmd.equals("delete")) {

            } else {
                System.out.println("사용할 수 없는 명령어입니다.");
            }
        }

    }

}

