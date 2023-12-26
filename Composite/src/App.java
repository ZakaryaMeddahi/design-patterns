public class App {
    public static void main(String[] args) throws Exception {
        Composite header = new Composite("header");
        Element child1 = new Element("child1");
        header.add(child1);
        Composite child2 = new Composite("child2");
        header.add(child2);
        Element child21 = new Element("child21");
        child2.add(child21);
        Element child22 = new Element("child22");
        child2.add(child22);

        header.operation();
    }
}


// Output
// header
// --child1
// --child2
// ----child21
// ----child22
