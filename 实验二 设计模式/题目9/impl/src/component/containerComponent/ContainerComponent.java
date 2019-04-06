package component.containerComponent;

import component.AbstractComponent;

import java.util.LinkedList;

public abstract class ContainerComponent extends AbstractComponent {

   LinkedList<AbstractComponent> components = new LinkedList<>();

   @Override
   public abstract void display();

   @Override
   public void addComponent(AbstractComponent c) {
      this.components.add(c);
   }

   @Override
   public void removeComponent(AbstractComponent c) {
      this.components.remove(c);
   }

   @Override
   public AbstractComponent getChild(int index) {
      return this.components.get(index);
   }

}