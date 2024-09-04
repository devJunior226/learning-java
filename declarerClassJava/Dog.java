package declarerClassJava;

/**
 * Creating Java Class
 */
public class Dog {
    /**
     * Declaring attributes
     */
    String breed;
    String color;
    int age;

    /**
     * Methods to set these attributes
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Methods to print all three values
     */
    public void printInfo() {
        System.out.println("Dog infos");
        System.out.println(this.breed);
        System.out.println(this.age);
        System.out.println(this.color);
    }
}






















