package declarerClassJava;

/**
 * Use of this class in the main method
 */
public class Main {
    public static void main(String[] args) {
        /**
         * Creating an object of the class Dog
         */
        Dog dogObject = new Dog();

        dogObject.setBreed("Golden Retriever");
        dogObject.setAge(20);
        dogObject.setColor("Golden");

        // Printing the values
        dogObject.printInfo();
    }
}
