package component;

public abstract class AbstractComponent {

   public abstract void display();

   public abstract void addComponent(AbstractComponent c);

   public abstract void removeComponent(AbstractComponent c);

   public abstract AbstractComponent getChild(int index);

}