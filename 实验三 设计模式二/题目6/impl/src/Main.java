import command.Command;
import command.LightCommand;
import invoker.Switch;
import util.XMLUtil;

public class Main {

    public static void main(String[] args) {
        Command command = (Command) XMLUtil.getBean();
        Switch s = new Switch(command);
        s.turnUp();

    }
}
