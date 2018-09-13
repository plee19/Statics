package us.plee19;

/**
 * Person class implementing Weighable with multiple overloaded constructor methods.
 * @author plee19
 * @version 1
 */
public class Person implements Weighable {
    String firstName;
    String lastName;
    int age;
    static int legs = 2;
    double weight;

    /**
     * Full Person class constructor with all four arguments to fill the non-static fields.
     * @param fn String of Person's first name
     * @param ln String of Person's last name
     * @param a integer of Person's age
     * @param w double of Person's weight
     */
    public Person(String fn, String ln, int a, double w) {
        firstName = fn;
        lastName = ln;
        age = a;
        weight = w;
    }

    /**
     * Person class constructor with first and last name fields.
     * @param fn String of Person's first name
     * @param ln String of Person's last name
     */
    public Person(String fn, String ln) {
        firstName = fn;
        lastName = ln;
        age = 0;
        weight = 0;
    }

    /**
     * Person class constructor with first name field only.
     * @param fn String of Person's first name
     */
    public Person(String fn) {
        firstName = fn;
        lastName = "none";
        age = 0;
        weight = 0;
    }

    /**
     * Person class constructor with age field only.
     * @param a integer of Person's age
     */
    public Person(int a) {
        age = a;
        firstName = "none";
        lastName = "none";
        weight = 0;
    }

    /**
     * Method to return the static variable legs for the Person class.
     * @return integer number of legs a Person has
     */
    public int getLegs() {
        return legs;
    }

    /**
     * Method to increment Person's weight by a given value.
     * @param w double weight to add to Person's existing weight value
     */
    public void addWeight(double w) {
        weight += w;
    }

    /**
     * Method to decrement Person's weight by a given value.
     * @param w double weight to subtract from Person's existing weight value
     */
    public void loseWeight(double w) {
        weight -= w;
    }

    /**
     * Method to return Person's weight value
     * @return double weight of Person
     */
    public double getWeight() {
        return weight;
    }
}


