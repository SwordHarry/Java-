package filter;

public abstract class AbstractFilter {

   AbstractFilter filter;

   public abstract void processData(java.lang.Object data);

   public void setFilter(AbstractFilter filter) {
      this.filter = filter;
   }

}