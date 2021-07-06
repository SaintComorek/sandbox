package tech.pantheon.academy.example.prime.task;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tech.pantheon.academy.example.prime.solution.PrimeNumberServiceImpl;

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

    @Test
    void isPrime() {
        final PrimeNumberService primeNumberService = new PrimeNumberServiceImpl();
        for (final Integer prime : primes) {
            Assertions.assertTrue(primeNumberService.isPrime(prime), "Prime check failed, tested prime: " + prime);
        }
    }
}