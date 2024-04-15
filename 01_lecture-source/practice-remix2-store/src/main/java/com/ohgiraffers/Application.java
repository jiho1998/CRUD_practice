package com.ohgiraffers;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ItemController itemController = new ItemController();

        do {
            System.out.println("================ 상품 관리 =================");
            System.out.println("1. 상품 전체 조회");
            System.out.println("2. 상품 상세 조회");
            System.out.println("3. 상품 추가");
            System.out.println("4. 상품 수정");
            System.out.println("5. 상품 삭제");
            System.out.print("메뉴 관리 번호를 입력하세요 : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: itemController.selectAllItem(); break;
                case 2: itemController.selectItemById(inputItemId()); break;
                case 3: itemController.registItem(inputItem()); break;
                case 4: itemController.modifyItem(inputModifyItem()); break;
                case 5: itemController.deleteItem(inputItemId()); break;
                default:
                    System.out.println("잘못된 메뉴를 선택하셧습니다.");
            }
        } while (true);
    }



    private static Map<String, String> inputItemId() {

        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴 ID를 입력하세요 : ");
        String id = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("id", id);

        return parameter;
    }

    private static Map<String, String> inputItem() {

        Scanner sc = new Scanner(System.in);
        System.out.print("상품 ID를 입력하세요 : ");
        String id = sc.nextLine();
        System.out.print("상품 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("상품 가격을 입력하세요 : ");
        String price = sc.nextLine();
        System.out.print("상품 개수 입력하세요 : ");
        String amount = sc.nextLine();


        Map<String, String> parameter = new HashMap<>();
        parameter.put("id", id);
        parameter.put("name", name);
        parameter.put("price", price);
        parameter.put("amount", amount);

        return parameter;

    }

    private static Map<String, String> inputModifyItem() {

        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 상품 코드를 입력하세요 : ");
        String id = sc.nextLine();
        System.out.print("수정할 상품 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("수정할 상품 가격을 입력하세요 : ");
        String price = sc.nextLine();
        System.out.print("수정할 상품 개수를 입력하세요 : ");
        String amount = sc.nextLine();
        System.out.print("수정할 상품 날짜를 입력하세요 : ");
        String date = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("id", id);
        parameter.put("name", name);
        parameter.put("price", price);
        parameter.put("amount", amount);
        parameter.put("date", date);

        return parameter;
    }
}
