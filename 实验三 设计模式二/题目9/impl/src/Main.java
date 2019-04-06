import adaptee.Annunciator;
import adaptee.CautionLight;
import adaptee.InsulatedDoor;
import adaptee.SecurityDoor;
import observer.*;
import subject.Thermosensor;

public class Main {

    public static void main(String[] args) {
        Thermosensor thermosensor = new Thermosensor();

        ResponsiveDevice alarmDevice = new AlarmDevice(new Annunciator());
        ResponsiveDevice cautionDevice = new CautionDevice(new CautionLight());
        ResponsiveDevice insulatedDevice = new InsulatedDevice(new InsulatedDoor());
        ResponsiveDevice securityDevice = new SecurityDevice(new SecurityDoor());

        thermosensor.attach(alarmDevice);
        thermosensor.attach(cautionDevice);
        thermosensor.attach(insulatedDevice);
        thermosensor.attach(securityDevice);

        thermosensor.notifyDevice();
    }
}
