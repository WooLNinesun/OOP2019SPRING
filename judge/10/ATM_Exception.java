
public class ATM_Exception extends Exception {
    private static final long serialVersionUID = 1L;

    public enum ExceptionTYPE {
        BALANCE_NOT_ENOUGH("BALANCE_NOT_ENOUGH"), AMOUNT_INVALID("AMOUNT_INVALID");
        private final String message;

        private ExceptionTYPE(String message) {
            this.message = message;
        }

        public String toString() {
            return this.message;
        }
    }

    public ATM_Exception(ATM_Exception.ExceptionTYPE ex_type) {
        super(ex_type.toString());
    }
}
