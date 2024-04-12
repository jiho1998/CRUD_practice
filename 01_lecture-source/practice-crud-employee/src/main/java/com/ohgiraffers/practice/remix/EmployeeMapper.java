package com.ohgiraffers.practice.remix;

import java.util.List;

public interface EmployeeMapper {

    List<EmployeeDTO> selectAllEmployee();

    EmployeeDTO selectEmployeeById(int id);

    int insertEmployee(EmployeeDTO employee);
}
