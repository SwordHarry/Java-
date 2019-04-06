package domain;

public abstract class GameObject extends GameBlock {

   public abstract void display();

   public void setColor(String colorType) {
      this.colorType = colorType;
   }

   public void addBlock(GameBlock block) {
      System.out.println("对不起，不支持该方法！");
   }

   public void removeBlock(GameBlock block) {
      System.out.println("对不起，不支持该方法！");
   }

   public GameBlock getBlock(int index) {
      System.out.println("对不起，不支持该方法！");
      return null;
   }

}