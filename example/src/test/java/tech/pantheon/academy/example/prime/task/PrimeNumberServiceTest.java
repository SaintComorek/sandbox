package tech.pantheon.academy.example.prime.task;

import com.google.common.collect.ImmutableSet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tech.pantheon.academy.example.prime.solution.PrimeNumberServiceImpl;

import java.util.Set;

class PrimeNumberServiceTest {

    /**
     * Manually generated because prime generator would reveal prime solver solution :/
     */
    private static final Set<Integer> primes = ImmutableSet.of(
            16721899,
            1638353,
            57859,
            13567,
            32917,
            79823,
            139,
            61);

    private static final Set<Integer> notPrimes = ImmutableSet.of(
            167218993,
            16383533,
            578593,
            135673,
            329173,
            798233,
            1393,
            615);

    @Test
    void isPrime() {
        final PrimeNumberService primeNumberService = new PrimeNumberServiceImpl();
        for (final Integer prime : primes) {
            Assertions.assertTrue(primeNumberService.isPrime(prime), "Prime check failed, tested prime: " + prime);
        }
    }

    @Test
    void isNotPrime() {
        final PrimeNumberService primeNumberService = new PrimeNumberServiceImpl();
        for (final Integer number : notPrimes) {
            Assertions.assertFalse(primeNumberService.isPrime(number), "Prime check failed, tested number: " + number);
        }
    }
}