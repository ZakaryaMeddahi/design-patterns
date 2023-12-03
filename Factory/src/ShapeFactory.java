public class ShapeFactory {

  Shape shape = null;

  public Shape createShape(String shapeName) {
    if(shapeName.equalsIgnoreCase("Circle")) {
      shape = new CircleShape();
    } else if(shapeName.equalsIgnoreCase("Rectangle")) {
      shape = new RectangleShape();
    } else if(shapeName.equalsIgnoreCase("Square")) {
      shape = new SquareShape();
    } else {
      System.out.println("Shape not found");
    }

    return shape;
  }
}