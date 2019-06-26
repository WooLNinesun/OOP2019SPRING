public class Tester {
    public static void main(String[] args) {
        IsLeapYear ily = new IsLeapYear();

        System.out.println(ily.determine(2014));
        System.out.println(ily.determine(2004));
        System.out.println(ily.determine(2100));
    }
}
