package tech.pantheon.academy.example.prime.task;

public interface PrimeNumberService {

    /**
     * Method returns true if provided number is prime, false otherwise
     * @param number Will be tested if its prime or not
     * @return Result of test
     */
    boolean isPrime(final int number);
}
