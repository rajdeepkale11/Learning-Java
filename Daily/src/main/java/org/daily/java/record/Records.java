package org.daily.java.record;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Records {

    public record Emp(int id, String name, double salary) {};

    public double totalSalary(List<Emp> empList, double limit) {
        return  empList.stream().filter(emp -> emp.salary > limit).mapToDouble(Emp::salary).sum();
    }

    @Test
    public void test() {
        List<Emp> empList = List.of(
                new Emp(1, "Raj", 55000),
                new Emp(2, "Taj", 75000),
                new Emp(3, "Xaj", 50000)
        );

        Assertions.assertEquals(empList.get(0).salary + empList.get(1).salary , totalSalary(empList, 50000));
    }
}