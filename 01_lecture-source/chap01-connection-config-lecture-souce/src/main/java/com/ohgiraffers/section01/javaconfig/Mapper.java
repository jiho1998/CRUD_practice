package com.ohgiraffers.section01.javaconfig;

import org.apache.ibatis.annotations.Select;

import java.util.Date;

public interface Mapper {

    @Select("SELECT CURDATE() FROM DUAL")

    java.util.Date selecySysdate();

}
