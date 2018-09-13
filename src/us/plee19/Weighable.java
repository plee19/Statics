package us.plee19;

/**
 * Interface to require that all objects implementing Weighable provide the addWeight() and loseWeight() methods.
 * @author plee19
 * @version 1
 */
public interface Weighable {
    void addWeight(double pounds);
    void loseWeight(double pounds);
}
