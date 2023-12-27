public class ObserverImpl1 implements Observer {
  public void update(Observable observable) {
    int state = ((ObservableImpl)observable).getState();
    System.out.println("Observer Impl 1: " + state);
  }
}
