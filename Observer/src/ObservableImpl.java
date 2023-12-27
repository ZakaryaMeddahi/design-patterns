import java.util.List;
import java.util.ArrayList;

public class ObservableImpl implements Observable {
  private int state;
  private List<Observer> observers = new ArrayList<>();

  @Override
  public void subscribe(Observer observer) {
    observers.add(observer);
  }

  public void unsubscribe(Observer observer) {
    observers.remove(observer);
  }

  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(this);
    }
  }

  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
    notifyObservers();
  }
}