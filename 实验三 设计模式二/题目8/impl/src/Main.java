import observer.Observer;
import observer.Shareholder;
import subject.Stock;

public class Main {

    public static void main(String[] args) {
        Stock stock = new Stock();
        stock.setStock(200);

        Observer observer1 = new Shareholder();
        Observer observer2 = new Shareholder();
        Observer observer3 = new Shareholder();

        stock.attach(observer1);
        stock.attach(observer2);
        stock.attach(observer3);

        stock.notifyObserver();

    }
}
