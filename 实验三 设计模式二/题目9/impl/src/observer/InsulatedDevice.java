package observer;

import adaptee.InsulatedDoor;

public class InsulatedDevice extends ResponsiveDevice {

   public InsulatedDoor insulatedDoor;

   public InsulatedDevice(InsulatedDoor insulatedDoor) {
      this.insulatedDoor = insulatedDoor;
   }

   public void execute() {
     insulatedDoor.close();
   }

}