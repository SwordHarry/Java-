package component.containerComponent;

        import component.AbstractComponent;

public class CFrame extends ContainerComponent {

   @Override
   public void display() {
      System.out.println("显示窗体");
      for (AbstractComponent component: this.components) {
         component.display();
      }

   }

}