public class ImplStandard implements Standard {
  @Override
  public void operation(int firstNumber, int secondNumber) {
    System.out.println("Standard, Result Is: " + firstNumber * secondNumber);
  }
}
