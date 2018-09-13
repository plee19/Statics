package us.plee19;

/**
 * Main method to demonstrate the Startup object and print a list of Persons to the console.
 * @author plee19
 * @version 1
 */
public class Main {
    public static void main(String[] args) {
        Startup begin = new Startup();
        Person[] personArray = begin.startUp();
        for (int i = 0; i < personArray.length; i++) {
            System.out.println(personArray[i].firstName + " " + personArray[i].lastName + " " + personArray[i].age);
        }
    }
}
