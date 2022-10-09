package day16.object_interactions;

public class Person {

    String name;
    int currentMoneyBalance;

    public Person(String name, int currentMoneyBalance) {
        this.name = name;
        this.currentMoneyBalance = currentMoneyBalance;
    }

    void addMoneyToPiggyBank(int amountToAdd, PiggyBank piggy) {
        if (amountToAdd <= currentMoneyBalance) {
            piggy.currentBalance = piggy.currentBalance + amountToAdd;
            currentMoneyBalance = currentMoneyBalance - amountToAdd;
            System.out.println(amountToAdd + " was added to the bank! Now piggy has " + piggy.currentBalance + "€");
        }else {
            System.out.println("We don`t have that much money to save. No money added.");
            System.out.println("We only have " + currentMoneyBalance + "€");
        }
    }

    void giveMoneyToAnotherPerson(int amountToGive, Person personWhoWillReceiveMoney) {
        if (amountToGive <= currentMoneyBalance) {
            personWhoWillReceiveMoney.currentMoneyBalance = personWhoWillReceiveMoney.currentMoneyBalance + amountToGive;
            System.out.println("We gave " + amountToGive + " to " + personWhoWillReceiveMoney.name);
            currentMoneyBalance = currentMoneyBalance + amountToGive;
        } else {
            System.out.println("Sorry, I don`t have that much money to give");
        }
    }
    //Goal is to read a lable from the given item
    void readLableOfTheItem (Item item) {
        System.out.println("Reading the item`s lable which is: " +item.lable);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", currentMoneyBalance=" + currentMoneyBalance +
                '}';
    }
}
