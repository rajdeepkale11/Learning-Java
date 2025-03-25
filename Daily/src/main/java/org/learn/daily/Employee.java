package org.learn.daily;

//        Create a record named Employee with fields: id, name, salary.
//
//        Write a method that takes a list of Employee records and returns the total salary of employees earning more than 50,000.
//
//        Use Streams for filtering and summing up salaries.
//
//        *Test Case
//
//        Input:
//        List of Employees:
//        [ Employee(1, "John", 60000), Employee(2, "Jane", 45000), Employee(3, "Alex", 70000) ]
//
//        Output:
//        Total Salary: 130000



public record Employee(Integer id, String name, Double salary) {}

//Main Code :

//        List<Employee> employeeList = new ArrayList<>();
//
//        employeeList.add(new Employee(1, "Raj", 50000.00));
//        employeeList.add(new Employee(2, "Taj", 40000.00));
//        employeeList.add(new Employee(3, "Kaj", 70000.00));
//
//        Long totalEmpEarningMoreThanFiftyThousand = employeeList.stream().filter(employee -> employee.salary() > 50000).count();
//
//        Double totalSalaryMoreThanFiftyThousand = employeeList.stream().filter(employee -> employee.salary() > 50000).mapToDouble(Employee::salary).sum();
//
//        System.out.println("Total Num of Emp Earning more than 50K : " + totalEmpEarningMoreThanFiftyThousand);
//        System.out.println("Total Salary Earned more than 50K : " + totalSalaryMoreThanFiftyThousand);


