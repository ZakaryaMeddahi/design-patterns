public class InheritanceAdapter extends ImplAdaptee implements Standard {
  @Override
  public void operation(int firstNumber, int secondNumber) {
    int result = operation1(firstNumber, secondNumber);
    operation2(result);
  }
}
