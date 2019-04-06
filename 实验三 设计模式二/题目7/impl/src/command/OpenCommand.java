package command;

import receiver.BoardScreen;

public class OpenCommand extends AbstractCommand {

   private BoardScreen board;

   public void execute() {
      board = BoardScreen.getInstance();
      board.open();
   }

}