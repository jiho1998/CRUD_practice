package com.ohgiraffers;

import java.util.List;

public interface ItemMapper {
    List<ItemDTO> selectAllItem();

    ItemDTO selelctItemById(int id);

    int insertItem(ItemDTO item);

    int updateItem(ItemDTO item);

    int deleteItem(int id);
}
