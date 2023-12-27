public interface Observable {
    public void subscribe(Observer observer);
    public void unsubscribe(Observer observer);
    public void notifyObservers();
}