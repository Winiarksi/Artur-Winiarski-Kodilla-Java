package Module_3.Module_3_1;

import java.util.HashSet;

class HashSetExample {
    public static void main(String[] args) {

        Employee worker1 = new Employee("Steven", "Newmack",
                1987, 6, 30);
        Employee worker2 = new Employee("Jennifer", "Nowak", 1988,2,28);
        Employee worker3 = new Employee("Robert", "Greenfield", 1987, 6, 15);
        Employee worker4 = new Employee("Monika", "Smith", 1984, 10, 18);
        Employee worker5 = new Employee("Stephanie", "Jackson", 1985, 4, 3);

        HashSet<Employee> workerSet = new HashSet<Employee>();
        workerSet.add(worker1);
        workerSet.add(worker2);
        workerSet.add(worker3);
        workerSet.add(worker4);
        workerSet.add(worker5);

        System.out.println(workerSet.contains(worker3));

        for (Employee listEmployee : workerSet){
            if(listEmployee.getBrithDate().getYear() >= 1986 ) {
                System.out.println(listEmployee);
            }
        }

    }
}