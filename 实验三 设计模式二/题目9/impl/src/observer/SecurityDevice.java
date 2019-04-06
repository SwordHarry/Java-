package observer;

import adaptee.SecurityDoor;

public class SecurityDevice extends ResponsiveDevice {

   private SecurityDoor securityDoor;

   public SecurityDevice(SecurityDoor securityDoor) {
      this.securityDoor = securityDoor;
   }

   public void execute() {
     securityDoor.open();
   }

}