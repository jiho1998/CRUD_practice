package com.ohgiraffers.practice.remix;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.practice.remix.Template.getSqlSession;

public class EmployeeService {

    public List<EmployeeDTO> selectAllEmployee() {

        SqlSession sqlSession = getSqlSession();

        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        List<EmployeeDTO> employeeList = employeeMapper.selectAllEmployee();

        sqlSession.close();

        return employeeList;
    }

    public EmployeeDTO selectEmployeeById(int id) {

        SqlSession sqlSession = getSqlSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        EmployeeDTO employee = employeeMapper.selectEmployeeById(id);

        sqlSession.close();
        return employee;
    }

    public boolean registEmployee(EmployeeDTO employee) {

        SqlSession sqlSession = getSqlSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        int result = employeeMapper.insertEmployee(employee);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true : false;
    }
}
