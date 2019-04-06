package domain;

public abstract class GameBlock {

   protected String colorType;

   public abstract void display();

   public abstract void setColor(String colorType);

   public abstract void addBlock(GameBlock block);

   public abstract void removeBlock(GameBlock block);

   public abstract GameBlock getBlock(int index);

}