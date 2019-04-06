package subject;

import observer.Observer;

import java.util.LinkedList;


public class Stock {

   private double stock;

   private LinkedList<Observer> observerLinkedList;

   public Stock() {
      observerLinkedList = new LinkedList<>();
   }

   public void attach(Observer observer) {
      observerLinkedList.add(observer);
   }

   public void detach(Observer observer) {
      observerLinkedList.remove(observer);
   }

   public void notifyObserver() {
      for (Observer o: observerLinkedList) {
         o.notified(stock);
      }
   }

   public double getStock() {
      return stock;
   }

   public void setStock(double stock) {
      this.stock = stock;
   }
}