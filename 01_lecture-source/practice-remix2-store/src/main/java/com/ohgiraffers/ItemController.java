package com.ohgiraffers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

public class ItemController {

    private final PrintResult printResult;
    private final ItemService itemService;

    public ItemController() {
        printResult = new PrintResult();
        itemService = new ItemService();
    }

    public void selectAllItem() {


        List<ItemDTO> itemList = itemService.selectAllItem();

        if (itemList != null) {
            printResult.printItemList(itemList);
        } else {
            printResult.printErrorMessage("selectList");
        }
    }

    public void selectItemById(Map<String, String> parameter) {

        int id = Integer.parseInt(parameter.get("id"));

        ItemDTO item = itemService.selectItemById(id);

        if (item != null) {
            printResult.printItem(item);
        } else {
            printResult.printErrorMessage("selectItemById");
        }

    }

    public void registItem(Map<String, String> parameter) {

        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String date = currentDate.format(formatter);

        int id = Integer.parseInt(parameter.get("id"));
        String name = parameter.get("name");
        int price = Integer.parseInt(parameter.get("price"));
        int amount = Integer.parseInt(parameter.get("amount"));

        ItemDTO item = new ItemDTO();
        item.setId(id);
        item.setName(name);
        item.setPrice(price);
        item.setAmount(amount);
        item.setDate(date);

        if (itemService.registItem(item)) {
            printResult.printSuccesMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }
    }

    public void modifyItem(Map<String, String> parameter) {

        int id = Integer.parseInt(parameter.get("id"));
        String name = parameter.get("name");
        int price = Integer.parseInt(parameter.get("price"));
        int amount = Integer.parseInt(parameter.get("amount"));
        String date = parameter.get("date");

        ItemDTO item = new ItemDTO();
        item.setId(id);
        item.setName(name);
        item.setPrice(price);
        item.setAmount(amount);
        item.setDate(date);

        if (itemService.modifyItem(item)) {
            printResult.printSuccesMessage("update");
        } else {
            printResult.printErrorMessage("update");
        }
    }

    public void deleteItem(Map<String, String> parameter) {

        int id = Integer.parseInt(parameter.get("id"));

        if (itemService.deleteItem(id)) {
            printResult.printSuccesMessage("delete");
        } else {
            printResult.printErrorMessage("delete");
        }
    }
}
