package com.ohgiraffers;

import java.util.List;

public class PrintResult {
    public void printItemList(List<ItemDTO> itemList) {

        for (ItemDTO item : itemList) {
            System.out.println(item);
        }
    }
    public void printErrorMessage(String errorCode) {

        String errorMessage = "";
        switch (errorCode) {
            case "selectList" : errorMessage = "상품 목록 조회를 실패하셧습니다."; break;
            case "selectOne" : errorMessage = "상품 상세 조회를 실패하셧습니다."; break;
            case "insert" : errorMessage = "신규 상품 등록에 실패하였습니다."; break;
            case "update" : errorMessage = "상품 수정에 실패하였습니다."; break;
            case "delete" : errorMessage = "상품 삭제를 실패하였습니다."; break;
        }

        System.out.println(errorMessage);
    }

    public void printItem(ItemDTO item) {

        System.out.println(item);
    }

    public void printSuccesMessage(String successItem) {

        String successMessage = "";
        switch (successItem) {
            case "insert" : successMessage = "신규 상품 등록을 성공하였습니다."; break;
            case "update" : successMessage = "상품 수정을 성공하였습니다."; break;
            case "delete" : successMessage = "상품 삭제를 성공하였습니다."; break;
        }

        System.out.println(successMessage);
    }
}
