public class App {
    public static void main(String[] args) throws Exception {
        Singleton firstObject = Singleton.getInstance();
        System.out.println("First Object: " + firstObject);
        Singleton secondObject = Singleton.getInstance();
        System.out.println("Second Object: " + secondObject);
    }
}

// Output
// First Object: Singleton@28a418fc
// Second Object: Singleton@28a418fc
