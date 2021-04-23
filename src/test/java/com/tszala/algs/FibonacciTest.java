package com.tszala.algs;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void shouldCalculateZeroForZero() {
        // given

        // when
        int result = Fibonacci.calculate(0);
        // then
        assertThat(result).isZero();
    }

    @Test
    public void shouldCalculateOneForOne() {
        // given

        // when
        int result = Fibonacci.calculate(1);

        // then
        assertThat(result).isOne();
    }

    @Test
    public void shouldCalculateOneForTwo() {
        // given

        // when
        int result = Fibonacci.calculate(2);

        // then
        assertThat(result).isOne();
    }

    @Test
    public void shouldCalculateTwoForThree() {
        // given

        // when
        int result = Fibonacci.calculate(3);

        // then
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void shouldCalculateForTen() {
        // given

        // when
        int result = Fibonacci.calculate(10);
        // then
        assertThat(result).isEqualTo(55);
    }

    @Test
    public void calculateWithTrampoline() {
        // given
        int i = 100000;

        // when
        Long result = Fibonacci.calculateWithTrampoline(10, 0L, 1L).get();

        // then
        assertThat(result).isEqualTo(55);
    }

}
