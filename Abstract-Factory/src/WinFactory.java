public class WinFactory implements GUIFactory {
  public Button createButton() {
    return new WinButton();
  }
  public CheckBox createCheckBox() {
    return new WinCheckBox();
  }
}
