
public class ATM_Exception extends Exception {
    private static final long serialVersionUID = 1L;
    String errMsg;

    public enum ExceptionTYPE {
        BALANCE_NOT_ENOUGH, AMOUNT_INVALID
    }

    public ATM_Exception(ATM_Exception.ExceptionTYPE ex_type) {
        switch (ex_type) {
        case BALANCE_NOT_ENOUGH:
            this.errMsg = "BALANCE_NOT_ENOUGH";
            break;
        case AMOUNT_INVALID:
            this.errMsg = "AMOUNT_INVALID";
            break;
        }
    }

    @Override
    public String getMessage() {
        return this.errMsg;
    }
}
