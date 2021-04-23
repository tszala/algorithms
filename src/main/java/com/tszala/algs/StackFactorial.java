package com.tszala.algs;

import java.util.Stack;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StackFactorial {

    Function<Long, Function<Long,Long>> calculate =  a -> b -> a * b;

    public Long calculate(int arg) {
        if(arg == 0 || arg == 1) {
            return 1L;
        }

        Stack<Integer> stack = new Stack<>();

        IntStream.rangeClosed(1,arg).forEach(stack::add);

        long factorial = 1L;

        while (!stack.isEmpty()) {
            factorial *= stack.pop();
        }
        return factorial;
    }

    public Long calculateStackWithFunctions(long arg) {
        return LongStream.rangeClosed(1, arg).reduce(1, (a,b) -> a*b);
    }

}
