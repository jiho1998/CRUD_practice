package com.ohgiraffers.practice.remix;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeController employeeController = new EmployeeController();

        do {
            System.out.println("=============== 직원 관리 ===============");
            System.out.println("1. 직원 전체조회");
            System.out.println("2. 직원번호로 직원조회");
            System.out.println("3. 직원추가");
            System.out.println("4. 직워정보 수정");
            System.out.print("관리 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1: employeeController.selectAllEmployee(); break;
                case 2: employeeController.selectEmployeeById(inputEmployeeId()); break;
                case 3: employeeController.registEmployee(inputEmployee()); break;
                default:
                    System.out.println("잘못된 번호를 선택하셧습니다."); break;
            }
        } while (true);
    }

    private static Map<String, String> inputEmployeeId() {

        Scanner sc = new Scanner(System.in);
        System.out.print("직원 ID를 입력하세요 : ");
        String Id = sc.nextLine();

        Map<String, String> parameter  = new HashMap<>();
        parameter.put("id", Id);

        return parameter;
    }

    private static Map<String, String> inputEmployee() {

        Scanner sc = new Scanner(System.in);
        System.out.print("사원번호를 입력하세요 : ");
        String id = sc.nextLine();
        System.out.print("직원 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("직원의 주민등록번호를 입력해주세요 : ");
        String empNo= sc.nextLine();
        System.out.print("직원의 이메일을 입력해주세요 : ");
        String email = sc.nextLine();
        System.out.print("직원의 전화번호를 입력해주세요 : ");
        String phone = sc.nextLine();
        System.out.print("직원의 부서코드를 입력해주세요 : ");
        String deptCode = sc.nextLine();
        System.out.print("직원의 직급코드를 입력해주세요 : ");
        String jobCode = sc.nextLine();
        System.out.print("직원의 급여등급을 부여해주세요 : ");
        String salLevel = sc.nextLine();
        System.out.print("직원의 급여액을 입력해주세요 : ");
        String salary = sc.nextLine();
        System.out.print("직원의 보너스율을 입력해주세요 : ");
        String bonus = sc.nextLine();
        System.out.print("직원의 관리자사번을 입력해주세요 : ");
        String managerId = sc.nextLine();
        System.out.print("직원의 입사일을 입력해주세요 : ");
        String hireDate = sc.nextLine();
        System.out.print("직원의 퇴사일을 입력해주세요 : ");
        String entDate = sc.nextLine();
        System.out.print("직원의 퇴직여부를 적어주세요 : ");
        String entYN = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("id", id);
        parameter.put("name", name);
        parameter.put("empNo", empNo);
        parameter.put("email", email);
        parameter.put("phone", phone);
        parameter.put("deptCode", deptCode);
        parameter.put("jobCode", jobCode);
        parameter.put("salLevel", salLevel);
        parameter.put("salary", salary);
        parameter.put("bonus", bonus);
        parameter.put("managerId", managerId);
        parameter.put("hireDate", hireDate);
        parameter.put("entDate", entDate);
        parameter.put("entYN", entYN);

        return parameter;
    }
}