package ex06.example06;

class Employee {
    public int baseSalary = 35000;

    int getSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    int getSalary() {
        return (baseSalary + 20000);
    }
}

class Programmer extends Employee {
    int getSalary() {
        return (baseSalary + 30000);
    }
}

public class Test {
    public static void main(String[] args) {
        Manager obj1 = new Manager();
        System.out.println("관리자의 월급:" + obj1.getSalary());

        Programmer obj2 = new Programmer();
        System.out.println("프로그래머의 월급:" + obj2.getSalary());
    }
}
