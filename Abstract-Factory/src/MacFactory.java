public class MacFactory implements GUIFactory {
  public Button createButton() {
    return new MacButton();
  }
  public CheckBox createCheckBox() {
    return new MacCheckBox();
  }
}
