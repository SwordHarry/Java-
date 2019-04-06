package menu;

import command.AbstractCommand;

public class MenuItem {

   private AbstractCommand command;

   public void setCommand (AbstractCommand command) {
      this.command = command;
   }

   public void click() {
      if(command != null) {
         command.execute();
      }
   }

}