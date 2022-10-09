package day15.strings;

public class StringsMain {

    public static void main(String[] args) {

        String myName = "Tom"; //String is an array of chars

        char[] letters = myName.toCharArray(); //convert my string to an array

        for (char singleLetter : letters) {
            System.out.println(singleLetter);
        }
        String dogsName = "Fido"; //String literal
        String catsName = "fido"; // String literal use the same value in the memory "Fido"

        String coldMeal = new String("MexicanSoup"); //String object created in Heap

        System.out.println();
        System.out.println(dogsName.equals(catsName)); // check if VALUES are equal
        System.out.println(dogsName.equalsIgnoreCase(catsName)); // values are equals ignoring cases

        System.out.println(dogsName == catsName); //check if both variable refer to SAME object

        String s1 = new String("Apple");
        String s2 = new String("Apple");

        System.out.println("Proof of that the string pool and heap exists");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        System.out.println("Dog" == "Dog");

        System.out.println();
        String greetings = "Happy Friday!";
        System.out.println("Length of the string is " + greetings.length());
        System.out.println(greetings.contains("day"));

    }


}
