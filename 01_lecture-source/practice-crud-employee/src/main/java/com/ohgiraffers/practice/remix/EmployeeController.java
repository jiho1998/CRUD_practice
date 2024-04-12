package com.ohgiraffers.practice.remix;

import java.util.List;
import java.util.Map;

public class EmployeeController {

    private final PrintResult printResult;

    private final EmployeeService employeeService;

    public EmployeeController() {
        printResult = new PrintResult();
        employeeService = new EmployeeService();
    }

    public void selectAllEmployee() {

        List<EmployeeDTO> employeeList = employeeService.selectAllEmployee();

        if (employeeList != null) {
            System.out.println(employeeList);
        } else {
            printResult.printErrorMessage("selectList");
        }
    }

    public void selectEmployeeById(Map<String, String> parameter) {

        int id = Integer.parseInt(parameter.get("id"));

        EmployeeDTO employee = employeeService.selectEmployeeById(id);

        if (employee != null) {
            printResult.printEmployee(employee);
        } else {
            printResult.printErrorMessage("selectOne");
        }

    }

    public void registEmployee(Map<String, String> parameter) {

        String id = parameter.get("id");
        String name = parameter.get("name");  // "name" map 안에 key에 있는 것
        String empNo = parameter.get("empNo");
        String jobCode = parameter.get("jobCode");
        String salLevel = parameter.get("salLevel");

        EmployeeDTO employee = new EmployeeDTO();
        employee.setId(id);
        employee.setName(name);
        employee.setEmpNo(empNo);
        employee.setJobCode(jobCode);
        employee.setSalLevel(salLevel);

        if (employeeService.registEmployee(employee)) {  // if do while 은 boolean
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }
    }
}
