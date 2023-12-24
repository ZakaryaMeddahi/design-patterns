public class App {
    public static void main(String[] args) throws Exception {
        GUIFactory winFactory = new WinFactory();
        Application winApp = new Application(winFactory);
        GUIFactory macFactory = new MacFactory();
        Application macApp = new Application(macFactory);
        winApp.createGui();
        winApp.run();
        macApp.createGui();
        macApp.run();
    }
}
