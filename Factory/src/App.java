public class App {
    public static void main(String[] args) throws Exception {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.createShape("Circle");
        shape1.draw();

        Shape shape2 = shapeFactory.createShape("Rectangle");
        shape2.draw();

        Shape shape3 = shapeFactory.createShape("Square");
        shape3.draw();
    }
}

// Output
// Drawing a circle
// Drawing a rectangle
// Drawing a square
