package us.plee19;

/**
 * Class set up to run the main method to demonstrate the Person class and Weighable interface.
 * @author plee19
 * @version 1
 */
public class Startup {
    public Person[] startUp() {
        Person pl = new Person("Paul", "Lee", 31, 200);
        Person aa = new Person("André", "Araujo", 35, 180);
        Person ms = new Person("Michael", "Smith", 27, 225);

        Person[] personArray = new Person[3];
        personArray[0] = pl;
        personArray[1] = aa;
        personArray[2] = ms;
        return personArray;
    }




}
