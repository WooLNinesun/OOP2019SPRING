
public class SimpleCalculator {
    private double result = 0.0;
    private int count = 0;
    private boolean finished = false;
    private String operators = new String("+-*/");
    private char operator = '0';
    private Double value = 0.0;

    public void calResult(String cmd) throws UnknownCmdException {
        if (verifiyCommand(cmd)) {
            switch (operator) {
            case '+':
                this.result += value;
                break;
            case '-':
                this.result -= value;
                break;
            case '*':
                this.result *= value;
                break;
            case '/':
                this.result /= value;
                break;
            default:
            }
            count++;
        }
    }

    public String getMsg() {
        if (this.finished) {
            return String.format("Final result = %.2f", this.result);
        }
        if (count == 0) {
            return String.format("Calculator is on. Result = %.2f", this.result);
        }
        if (count == 1) {
            return String.format("Result %c %.2f = %.2f. New result = %.2f", operator, value, this.result, this.result);
        }
        if (count > 1) {
            return String.format("Result %c %.2f = %.2f. Updated result = %.2f", operator, value, this.result,
                    this.result);
        }
        return "TODO";
    }

    public boolean endCalc(String cmd) {
        if (cmd.toLowerCase().equals("r")) {
            this.finished = true;
        }
        return this.finished;
    }

    private boolean verifiyCommand(String raw_cmd) throws UnknownCmdException {
        String[] cmd = raw_cmd.split(" ");
        if (cmd.length != 2) {
            String errMsg = "Please enter 1 operator and 1 value separated by 1 space";
            throw new UnknownCmdException(errMsg);
        }

        operator = cmd[0].charAt(0);
        if (cmd[0].length() != 1 || operators.indexOf(cmd[0].charAt(0)) < 0) {
            operator = '0';
        }

        try {
            value = Double.parseDouble(cmd[1]);
        } catch (NumberFormatException e) {
            value = null;
        }

        if (operator == '0' && value == null) {
            String fmtstr = "%s is an unknown operator and %s is an unknown value";
            String errMsg = String.format(fmtstr, cmd[0], cmd[1]);
            throw new UnknownCmdException(errMsg);
        }
        if (operator == '0') {
            String fmtstr = "%s is an unknown operator";
            String errMsg = String.format(fmtstr, cmd[0]);
            throw new UnknownCmdException(errMsg);
        }
        if (value == null) {
            String fmtstr = "%s is an unknown value";
            String errMsg = String.format(fmtstr, cmd[1]);
            throw new UnknownCmdException(errMsg);
        }

        if (operator == '/' && value == 0.0) {
            String errMsg = "Can not divide by 0";
            throw new UnknownCmdException(errMsg);
        }
        return true;
    }
}
