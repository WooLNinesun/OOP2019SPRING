public class GreenCrud {
    /**
     * calculate the size of the green crud population after a given amount of days,
     * starting at a given initial size.
     * 
     * @param initialSize integers, and that 1 <= {initialSize} <= 10000
     * @param days        integers, and that 1 =< {days} <= 100
     * @return the size of the green crud population after days {days}, starting at an
     *         initial size of {initialSize}.
     */
    public static int calPopulation(int initialSize, int days) {
        return initialSize * fibonacci(days / 5 + 1);
    }

    /**
     * A Fibonacci sequence starts with 0 and 1 as the first two numbers. Each
     * subsequent number is the sum of the previous two. For example, 0, 1, 1, 2, 3,
     * 5, 8, 13, 21, 34, 55, 89, ...
     * 
     * @param index i-th index
     * @return the {index}-th entry in the fibonacci sequence
     */
    public static int fibonacci(int index) {
        int fn0 = 0, fn1 = 1, fn = 1;
        for (int i = 2; i <= index; i++) {
            fn = fn0 + fn1;
            fn0 = fn1;
            fn1 = fn;
        }
        return fn;
    }
}
