package com.tszala.algs;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StackFactorialTest {

    @Test
    public void shouldCalculateFactorialOfTwo() {
        StackFactorial stackFactorial = new StackFactorial();

        Long factorial = stackFactorial.calculate(2);

        assertThat(factorial).isEqualTo(2);
    }

    @Test
    public void shouldCalculateFactorialOfThree() {
        StackFactorial stackFactorial = new StackFactorial();

        Long factorial = stackFactorial.calculate(3);

        assertThat(factorial).isEqualTo(6);
    }

    @Test
    public void shouldCalculateFactorialOfThreeWithStream() {
        StackFactorial stackFactorial = new StackFactorial();

        Long factorial = stackFactorial.calculateStackWithFunctions(4);

        assertThat(factorial).isEqualTo(24);
    }

    @Test
    public void shouldCalculateFactorialOfHundredWithStream() {
        StackFactorial stackFactorial = new StackFactorial();

        Long factorial = stackFactorial.calculateStackWithFunctions(40L);

        assertThat(factorial).isEqualTo(24L);
    }

}
