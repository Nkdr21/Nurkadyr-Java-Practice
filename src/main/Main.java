package main;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
        String name = "Nurkadyr";
        int age = 18;
        System.out.println("My name is " + name);
        System.out.println("Age " + age);

        System.out.println("=== Simple Bank Account Demo ===");

        BankAccount acc1 = new BankAccount("Nurkadyr", 10000);
        acc1.printInfo();

        acc1.deposit(5000);
        System.out.println("After deposit 5000:");
        acc1.printInfo();

        acc1.withdraw(12000);
        System.out.println("After withdraw 12000:");
        acc1.printInfo();

        acc1.withdraw(50000);
    }
}
