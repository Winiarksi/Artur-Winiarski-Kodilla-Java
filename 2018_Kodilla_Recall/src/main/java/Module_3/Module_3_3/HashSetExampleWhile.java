package Module_3.Module_3_3;

import Module_3.Module_3_1.Employee;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExampleWhile {

    public static void main(String[] args){

        Employee employee1 = new Employee("Krzysztof", "Żgadło", 1975, 12, 18);
        Employee employee2 = new Employee("Agata", "Kot", 1943, 1, 17);
        Employee employee3 = new Employee("Krzysztof", "Żgadło", 1999, 6, 8);
        Employee employee4 = new Employee("Krzysztof", "Żgadło", 2001, 12, 12);
        Employee employee5 = new Employee("Krzysztof", "Żgadło", 2003, 5, 30);

        HashSet<Employee> employeeList = new HashSet<Employee>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);

        Iterator<Employee> iteratorWorkersSet = employeeList.iterator();

        while(iteratorWorkersSet.hasNext()){
            Employee currentWorker = iteratorWorkersSet.next();
            System.out.println(currentWorker);
        }
    }

}
