package filter;

public class VerifyFilter extends AbstractFilter {

   public void processData(java.lang.Object data) {
      System.out.println("对" + data + "进行校验");

      if(this.filter != null) {
         this.filter.processData(data);
      }
   }

}