import subject.Proxy;
import subject.Subject;

public class Main {

    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.method();
    }
}
