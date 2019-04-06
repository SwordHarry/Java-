package component.baseComponent;

import component.AbstractComponent;

public abstract class BaseComponent extends AbstractComponent {

   @Override
   public abstract void display();

   @Override
   public void addComponent(AbstractComponent c) {
      System.out.println("对不起，不支持该方法！");
   }

   @Override
   public void removeComponent(AbstractComponent c) {
      System.out.println("对不起，不支持该方法！");
   }

   @Override
   public AbstractComponent getChild(int index) {
      System.out.println("对不起，不支持该方法！");
      return null;
   }

}