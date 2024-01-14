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

// Output
// You clicked windows button!
// Windows Checkbox is checked
// You clicked Mac button!
// Mac Checkbox is checked