
public class GreenCrud {
    public static int calPopulation(int initialSize, int days) {
        return initialSize * fibonacci(days / 5 + 1);
    }

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
