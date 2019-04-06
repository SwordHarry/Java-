package observer;

import adaptee.Annunciator;

public class AlarmDevice extends ResponsiveDevice {

   private Annunciator annunciator;

   public AlarmDevice(Annunciator annunciator) {
      this.annunciator = annunciator;
   }

   public void execute() {
      annunciator.alarm();
   }

}