package ui;

import java.util.Scanner;

import action.Action;
import action.MemberDeleteAction;
import action.MemberListAction;
import action.MemberUpdateAction;
import action.MemberRegistAction;
import action.MemberSearchAction;
import action.MemberController;
import vo.Member;

public class MemberUI {
    public static Member[] memberArray = new Member[0];

    public static void main(String[] args) {
        MemberController memberController = new MemberController();
        boolean stop = false;
        Scanner sc = new Scanner(System.in);
        Action action = null;
        int menu =0;
        do {
            System.out.println("=====UserData Management=====");
            System.out.println("1.Join us");
            System.out.println("2.View User List");
            System.out.println("3.Modify UserData");
            System.out.println("4.Delete UserData");
            System.out.println("5.Search UserData");
            System.out.println("6.Exit");

            System.out.print("Menu number");

            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    action = new MemberRegistAction();
                    break;
                case 2:
                    action = new MemberListAction();
                    break;
                case 3:
                    action = new MemberUpdateAction();
                    break;
                case 4:
                    action = new MemberDeleteAction();
                    break;
                case 5:
                    action = new MemberSearchAction();
                    break;
                case 6:
                    stop = true;
                    System.out.println("Exit");
                    break;
                default:
                    break;
            }
                if(action != null) {
                    memberController.processRequest(sc, action);
            }
        }while (!stop);
    }
}

