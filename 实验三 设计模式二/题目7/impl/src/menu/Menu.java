package menu;

import java.util.LinkedList;

public class Menu {

   public LinkedList<MenuItem> menuItemList = new LinkedList<>();

   public void addMenuItem(MenuItem menuItem) {
      menuItemList.add(menuItem);
   }

}