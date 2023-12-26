public class CompositionAdapter implements Standard {
  private ImplAdaptee adaptee = new ImplAdaptee();
  @Override
  public void operation(int firstNumber, int secondNumber) {
    int result = adaptee.operation1(firstNumber, secondNumber);
    adaptee.operation2(result);
  }
}
