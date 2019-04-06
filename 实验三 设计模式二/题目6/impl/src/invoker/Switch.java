package invoker;

import command.Command;

public class Switch {

   private Command command;

   public Switch(Command command) {
      this.command = command;
   }

   public void setCommand(Command command) {
      this.command = command;
   }

   public void turnUp() {
      command.execute();
   }

}