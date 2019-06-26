public class Tester {
    public static void main(String[] args) {
        SimpleCalculator cal = new SimpleCalculator();
        String cmd = null;
        System.out.println(cal.getMsg());
        String cmd_str = "+ 5,- 2,* 5,/ 3,% 2,* D,X D,XD,, ,/ 1000000,/ 00.000,/ 0.000001,+ 1 + 1,- 1.66633,r R,r";
        String[] cmd_arr = cmd_str.split(",");
        for (int i = 0; i < cmd_arr.length; i++) {
          try {
            if (cal.endCalc(cmd_arr[i])) 
              break;		
            cal.calResult(cmd_arr[i]);
            System.out.println(cal.getMsg());
          } catch (UnknownCmdException e) {
            System.out.println(e.getMessage());
          }
        }
        System.out.println(cal.getMsg());
    }
}
