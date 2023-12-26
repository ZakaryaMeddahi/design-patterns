public class App {
    public static void main(String[] args) throws Exception {
        Standard standard = new ImplStandard();
        standard.operation(3, 5);
        Standard adaptee1 = new CompositionAdapter();
        adaptee1.operation(3, 5);
        Standard adaptee2 = new InheritanceAdapter();
        adaptee2.operation(3, 5);
    }
}

// Output
// Standard, Result Is: 15
// Adaptee, Result Is: 15
// Adaptee, Result Is: 15
