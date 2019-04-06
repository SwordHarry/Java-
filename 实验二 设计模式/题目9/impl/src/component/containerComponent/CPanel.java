package component.containerComponent;

        import component.AbstractComponent;

public class CPanel extends ContainerComponent {

   @Override
   public void display() {
      System.out.println("显示面板");
      for (AbstractComponent component: this.components) {
         component.display();
      }

   }

}