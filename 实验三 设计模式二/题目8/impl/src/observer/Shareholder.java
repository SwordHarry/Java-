package observer;

public class Shareholder implements Observer {

   public void notified(double stock) {
      System.out.println("股民你好！你的股票变化已超5%，现价格为"+stock);
   }

}