package academy.learnprogramming.javacode;

public class NullReferences {
    public static void main(String[] args) {
        // This code will of course result in a NPE
        String str = null;
        str.toUpperCase();
    }
}
