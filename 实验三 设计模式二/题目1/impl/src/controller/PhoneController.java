package controller;

import manager.AddressBookManager;
import manager.PhotoManager;
import manager.SMSManager;
import manager.SongManager;

public class PhoneController {

   private AddressBookManager addressBook;

   private SMSManager sms;

   private PhotoManager photo;

   private SongManager song;

   public PhoneController() {
      addressBook = new AddressBookManager();
      sms = new SMSManager();
      photo = new PhotoManager();
      song = new SongManager();
   }

   public void backup() {
      addressBook.backup();
      sms.backup();
      photo.backup();
      song.backup();
   }
}