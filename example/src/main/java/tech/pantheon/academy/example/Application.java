package tech.pantheon.academy.example;

import tech.pantheon.academy.example.prime.solution.PrimeNumberServiceImpl;
import tech.pantheon.academy.example.prime.task.PrimeNumberService;

public class Application {

    public static void main(String[] args) {
        final int number = Integer.parseInt(args[0]);
        final PrimeNumberService primeNumberService = new PrimeNumberServiceImpl();
        if (primeNumberService.isPrime(number)) {
            System.out.println("Number " + number + " is a Prime!!!");
        } else {
            System.out.println("Number " + number + " is not a Prime!!!");
        }
    }
}
