package us.plee19;

public class Startup {
    public static void main(String[] args) {
        Person pl = new Person("Paul", "Lee", 31, 200);
        Person aa = new Person("André", "Araujo", 35, 180);
        Person ms = new Person("Michael", "Smith", 27, 225);

        Person[] personArray = new Person[3];
        personArray[0] = pl;
        personArray[1] = aa;
        personArray[2] = ms;

        for (int i = 0; i < personArray.length; i++) {
            System.out.println(personArray[i].firstName + " " + personArray[i].lastName + " " + personArray[i].age);
        }
    }

}
