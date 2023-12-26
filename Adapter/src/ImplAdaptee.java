public class ImplAdaptee {
  public int operation1(int firstNumber, int secondNumber) {
    return firstNumber * secondNumber;
  }

  public void operation2(int number) {
    System.out.println("Adaptee, Result Is: " + number);
  }
}
