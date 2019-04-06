package observer;

import adaptee.CautionLight;

public class CautionDevice extends ResponsiveDevice {

   private CautionLight cautionLight;

   public CautionDevice(CautionLight cautionLight) {
      this.cautionLight = cautionLight;
   }

   public void execute() {
      cautionLight.flicker();
   }

}