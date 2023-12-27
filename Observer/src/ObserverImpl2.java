public class ObserverImpl2 implements Observer {
  public void update(Observable observable) {
    int state = ((ObservableImpl)observable).getState();
    System.out.println("Observer Impl 2: " + state);
  }
}
