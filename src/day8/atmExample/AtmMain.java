package day8.atmExample;

public class AtmMain {
    public static void main(String[] args) {

        CreditCard visa = new CreditCard("VISA", 1234, 250);
        AtmMachine swedbankATM = new AtmMachine(5678);

        if (swedbankATM.isAuthenticated(visa)) {
            System.out.println("Welcome to Swedbank!");
            int userMenuSelection = swedbankATM.getMenuSelection();
            if (userMenuSelection == 1) {
              swedbankATM.showBalance(visa);
            } else if (userMenuSelection == 2){
                swedbankATM.addMoney(visa);
            }
        } else {
            System.out.println("We don`t know you! Bye!");
        }

    }
}
