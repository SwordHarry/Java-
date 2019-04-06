package filter;

public class TypeFilter extends AbstractFilter {

   public void processData(java.lang.Object data) {
      System.out.println("对" + data + "进行格式转换");

      if(this.filter != null) {
         this.filter.processData(data);
      }
   }
}