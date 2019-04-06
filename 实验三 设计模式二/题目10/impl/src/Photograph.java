import filter.Filter;

public class Photograph {

   private Filter filter;

   public Photograph(Filter filter) {
      this.filter = filter;
   }

   public void display() {
      filter.display();
   }
}