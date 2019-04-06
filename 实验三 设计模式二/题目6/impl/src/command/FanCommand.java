package command;

import receiver.Fan;

public class FanCommand extends Command {

   private Fan fan;

   public void execute() {
      fan = new Fan();
      fan.fan();
   }

}