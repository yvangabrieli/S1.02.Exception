package Nivel1;

public class EmptySaleException extends Exception {
    public EmptySaleException() {
        super("To make a Sale you must first enter a product");
    }
}