public class Application {
  private GUIFactory factory;
  private Button button;
  Application(GUIFactory factory) {
    this.factory = factory;
  }

  void createGui() {
    this.button = factory.createButton();
  }

  void run() {
    button.click();
  }
}
