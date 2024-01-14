public class Application {
  private GUIFactory factory;
  private Button button;
  private CheckBox checkBox;

  Application(GUIFactory factory) {
    this.factory = factory;
  }

  void createGui() {
    this.button = factory.createButton();
    this.checkBox = factory.createCheckBox();
  }

  void run() {
    button.click();
    checkBox.check();
  }
}
