package class3;

public class AtmTest {
    public static void main(String[] args) {
        ATM atm = new ATM(12, 20, 30);
        atm.addMoney(10, ATM.FIFTY);
        atm.addMoney(10, ATM.TWENTY);
        atm.addMoney(10, ATM.TEN);
        System.out.println(atm.getTen());
        boolean isTaked = atm.takeMoney(150);
        System.out.println(isTaked);
        //System.out.println(atm.takeMoney(20));
        System.out.println(atm);
    }
}
