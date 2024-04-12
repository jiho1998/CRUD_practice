package com.ohgiraffers.practice.remix;

public class PrintResult {


    public void printErrorMessage(String errorCode) {

        String errorMessage = "";
        switch (errorCode) {
            case "selectList" : errorMessage = "직원 조회를 실패하셧습니다."; break;
            case "selectOne" : errorMessage = "직원 상세 조회를 실패하셧습니다"; break;
            case "insert" : errorMessage = "직원 등록을 실패 하였습니다"; break;
            case "update" : errorMessage = "직원 정보 수정을 실패하였습니다"; break;
            case "delet" : errorMessage = "직원 탈퇴를 실패하였습니다"; break;
        }

        System.out.println(errorCode);
    }

    public void printEmployee(EmployeeDTO employee) {

        System.out.println(employee);
    }

    public void printSuccessMessage(String successCode) {

        String successMessage = "";
        switch (successCode) {
            case "insert" : successMessage = "신규 직원 등록을 성공하였습니다."; break;
            case "update" : successMessage = "직원 정보 수정을 성공하였습니다."; break;
            case "delete" : successMessage = "직원 탈퇴를 성공하였습니다."; break;
        }
        System.out.println(successMessage);
    }
}
