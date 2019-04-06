package subject;

import java.util.Date;

public class Proxy extends Subject {

   private Subject subject = new RealSubject();

   public void method() {
     try {
        preMethod();
        subject.method();
        postMethod();
     } catch (Exception e) {
        e.printStackTrace();
        System.out.println("方法调用失败");
     }
   }

   public void preMethod() {
      System.out.println("方法method()被调用，调用时间为" + new Date());
   }

   public void postMethod() {
      System.out.println("方法method()调用成功");
   }

}