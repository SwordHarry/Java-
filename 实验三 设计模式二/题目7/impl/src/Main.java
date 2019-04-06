import command.CreateCommand;
import command.EditCommand;
import command.OpenCommand;
import menu.Menu;
import menu.MenuItem;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();

        MenuItem menuItem1 = new MenuItem();
        menuItem1.setCommand(new CreateCommand());
        menu.addMenuItem(menuItem1);

        MenuItem menuItem2 = new MenuItem();
        menuItem2.setCommand(new OpenCommand());
        menu.addMenuItem(menuItem2);

        MenuItem menuItem3 = new MenuItem();
        menuItem3.setCommand(new EditCommand());
        menu.addMenuItem(menuItem3);

        for(MenuItem m: menu.menuItemList) {
            m.click();
        }
    }
}
