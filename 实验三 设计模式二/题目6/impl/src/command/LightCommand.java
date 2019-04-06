package command;

import receiver.Light;

public class LightCommand extends Command {

   private Light light;

   public void execute() {
      light = new Light();
      light.light();
   }

}