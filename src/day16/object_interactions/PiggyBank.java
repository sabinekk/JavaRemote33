package day16.object_interactions;

public class PiggyBank {

    String savingUpGoal;
    int currentBalance;

    public PiggyBank(String savingUpGoal, int currentBalance) {
        this.savingUpGoal = savingUpGoal;
        this.currentBalance = currentBalance;
    }

    int takeOutMoney (int amountToTakeOut){
        if (currentBalance >= amountToTakeOut) {
            System.out.println("Taking out " + amountToTakeOut + " € from the bank.");
            currentBalance = currentBalance - amountToTakeOut;
            return amountToTakeOut;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "PiggyBank{" +
                "savingUpGoal='" + savingUpGoal + '\'' +
                ", currentBalance=" + currentBalance +
                '}';
    }
}
