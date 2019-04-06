package subject;

import observer.ResponsiveDevice;

import java.util.LinkedList;

public class Thermosensor {

   private LinkedList<ResponsiveDevice> responsiveDeviceLinkedList;

   public Thermosensor() {
      responsiveDeviceLinkedList = new LinkedList<>();
   }

   public void attach(ResponsiveDevice responsiveDevice) {
      responsiveDeviceLinkedList.add(responsiveDevice);
   }

   public void detach(ResponsiveDevice responsiveDevice) {
      responsiveDeviceLinkedList.remove(responsiveDevice);
   }

   public void notifyDevice() {
      for (ResponsiveDevice r:responsiveDeviceLinkedList) {
         r.execute();
      }
   }

}