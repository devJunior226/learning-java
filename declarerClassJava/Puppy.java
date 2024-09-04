package declarerClassJava;

public class Puppy {
    int puppyAge;

    public Puppy(String name) {
        System.out.println("Puppy name is " + name);
    }

    public void setPuppyAge(int puppyAge) {
        this.puppyAge = puppyAge;
    }
    int getPuppyAge() {
        return puppyAge;
    }


    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        Puppy puppy = new Puppy("Puppy");

        // Set age
        puppy.setPuppyAge(20);

        // Get age
        puppy.getPuppyAge();

        System.out.println("Puppy age is " + puppy.getPuppyAge());
    }
}
