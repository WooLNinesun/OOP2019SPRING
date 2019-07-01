
public class IsLeapYear {
    /**
     * Determine whether or not a given year is a leap year.
     * 
     * * Every year that is exactly divisible by 400 is a leap year.
     * * Every year that is exactly divisible by 4 but not by 100 is a leap year.
     * 
     * @param year integer, and that 1 <= {year} <= 10000.
     * @return a boolean stating whether or not {year} is a leap year.
     */
    public static boolean determine(int year) {
        // (year % 400 == 0)                    ==> divisible by 400
        // (year % 4 == 0 && year % 100 != 0)   ==> divisible by 4 but not by 100
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        }
        return false;
    }
}
