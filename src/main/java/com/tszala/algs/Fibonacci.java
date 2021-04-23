package com.tszala.algs;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Fibonacci calculator");


    }

    public static int calculate(int number) {
        if(number == 0) {
            return 0;
        }

        if(number == 1 || number == 2) {
            return 1;
        }

        return calculate(number -1) + calculate(number-2);
    }

    public static int calculateWithWhile(int maxNumber) {
        int previousNumber = 0, nextNumber = 1;
        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");

        int i=1;
        while(i <= maxNumber)
        {
            System.out.print(previousNumber+" ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            i++;
        }
        return nextNumber;
    }

    public static Trampoline<Long> calculateWithTrampoline(Integer count, Long a, Long b) {
        return count == 0 ? Trampoline.done(a) : Trampoline.more(() -> calculateWithTrampoline(count - 1, b, a + b));
    }
}
