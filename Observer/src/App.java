public class App {
    public static void main(String[] args) throws Exception {
        ObservableImpl observable = new ObservableImpl();
        Observer observer1 = new ObserverImpl1();
        Observer observer2 = new ObserverImpl2();

        observable.subscribe(observer1);
        observable.subscribe(observer2);

        System.out.println("Triggering event for the first time");
        observable.setState(1);
        
        System.out.println("Triggering event for the second time");
        observable.setState(2);
    }
}


// Output
// Observer Impl 1: 1
// Observer Impl 2: 1
// Observer Impl 1: 2
// Observer Impl 2: 2
