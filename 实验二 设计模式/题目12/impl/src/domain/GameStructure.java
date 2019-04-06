package domain;

import java.util.LinkedList;

public class GameStructure extends GameBlock {

   private LinkedList<GameBlock> gameBlocks = new LinkedList<>();

   public void display() {
      for (GameBlock gameBlock: gameBlocks) {
         gameBlock.display();
      }
   }

   @Override
   public void setColor(String colorType) {
      for (GameBlock gameBlock: gameBlocks) {
         gameBlock.setColor(colorType);
      }
   }

   @Override
   public void addBlock(GameBlock block) {
      gameBlocks.add(block);
   }

   @Override
   public void removeBlock(GameBlock block) {
      gameBlocks.remove(block);
   }

   @Override
   public GameBlock getBlock(int index) {
      return gameBlocks.get(index);
   }

}