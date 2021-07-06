package tech.pantheon.academy.example.prime.solution;

import tech.pantheon.academy.example.prime.task.PrimeNumberService;

public class PrimeNumberServiceImpl implements PrimeNumberService {

    @Override
    public boolean isPrime(final int number) {
        if (number <= 3) {
            return number > 1;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
