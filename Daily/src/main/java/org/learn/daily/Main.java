package org.learn.daily;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(1, "Raj", 50000.00));
        employeeList.add(new Employee(2, "Taj", 40000.00));
        employeeList.add(new Employee(3, "Kaj", 70000.00));

        long totalEmpEarningMoreThanFiftyThousand = employeeList.stream().filter(employee -> employee.salary() > 50000).count();

        double totalSalaryMoreThanFiftyThousand = employeeList.stream().filter(employee -> employee.salary() > 50000).mapToDouble(Employee::salary).sum();

        System.out.println("Total Num of Emp Earning more than 50K : " + totalEmpEarningMoreThanFiftyThousand);
        System.out.println("Total Salary Earned more than 50K : " + totalSalaryMoreThanFiftyThousand);
    }
}