package us.plee19;

public class Person implements Weighable {
    String firstName;
    String lastName;
    int age;
    static int legs = 2;
    double weight;

    public Person(String fn, String ln, int a, double w) {
        firstName = fn;
        lastName = ln;
        age = a;
        weight = w;
    }

    public Person(String fn, String ln) {
        firstName = fn;
        lastName = ln;
        age = 0;
        weight = 0;
    }

    public Person(String fn) {
        firstName = fn;
        lastName = "none";
        age = 0;
        weight = 0;
    }

    public Person(int a) {
        age = a;
        firstName = "none";
        lastName = "none";
        weight = 0;
    }

    public int getLegs() {
        return legs;
    }

    public void addWeight(double w) {
        weight += w;
    }

    public void loseWeight(double w) {
        weight -= w;
    }
}


