import controller.AbstractModule;
import controller.XMLModule;

public class Main {

    public static void main(String[] args) {
        AbstractModule abstractModule = new XMLModule();
        abstractModule.dataDisplay("实验报告.xml");
    }
}
