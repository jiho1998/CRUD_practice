package com.ohgiraffers;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.Template.getSqlSession;

public class ItemService {
    public List<ItemDTO> selectAllItem() {

        SqlSession sqlSession = getSqlSession();

        ItemMapper itemMapper = sqlSession.getMapper(ItemMapper.class);

        List<ItemDTO> itemList = itemMapper.selectAllItem();

        sqlSession.close();

        return itemList;
    }

    public ItemDTO selectItemById(int id) {

        SqlSession sqlSession = getSqlSession();

        ItemMapper itemMapper = sqlSession.getMapper(ItemMapper.class);

        ItemDTO item = itemMapper.selelctItemById(id);

        sqlSession.close();

        return item;
    }

    public boolean registItem(ItemDTO item) {

        SqlSession sqlSession = getSqlSession();

        ItemMapper itemMapper = sqlSession.getMapper(ItemMapper.class);

        int result = itemMapper.insertItem(item);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }

    public boolean modifyItem(ItemDTO item) {

        SqlSession sqlSession = getSqlSession();

        ItemMapper itemMapper = sqlSession.getMapper(ItemMapper.class);

        int result = itemMapper.updateItem(item);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }

    public boolean deleteItem(int id) {

        SqlSession sqlSession = getSqlSession();

        ItemMapper itemMapper = sqlSession.getMapper(ItemMapper.class);

        int result = itemMapper.deleteItem(id);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }
}
