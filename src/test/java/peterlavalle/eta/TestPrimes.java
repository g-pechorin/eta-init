package peterlavalle.eta;

import junit.framework.TestCase;

public class TestPrimes extends TestCase {
    public void testPrime7() {
        assertEquals(
                7,
                peterlavalle.eta.Primes.primeN(3)
        );
    }

    public void testPrime101() {
        assertEquals(
                557,
                peterlavalle.eta.Primes.primeN(101)
        );
    }
}
