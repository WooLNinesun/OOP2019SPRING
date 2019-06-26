public class Tester {
    public static void main(String[] args) {
      Account David = new Account(4000);
      Simple_ATM_Service atm = new Simple_ATM_Service();
      System.out.println("---- first withdraw ----");
      atm.withdraw(David,1000);
      System.out.println("---- second withdraw ----");
      atm.withdraw(David,1000);
      System.out.println("---- third withdraw ----");
      atm.withdraw(David,1001);
      System.out.println("---- fourth withdraw ----");
      atm.withdraw(David,4000);
    }
}
