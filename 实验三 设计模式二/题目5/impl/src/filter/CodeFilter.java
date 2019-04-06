package filter;

public class CodeFilter extends AbstractFilter {

   public void processData(java.lang.Object data) {
      System.out.println("对" + data + "进行格式编码");

      if(this.filter != null) {
         this.filter.processData(data);
      }
   }

}