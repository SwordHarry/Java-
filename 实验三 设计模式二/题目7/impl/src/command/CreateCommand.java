package command;

import receiver.BoardScreen;

public class CreateCommand extends AbstractCommand {

   private BoardScreen board;

   public void execute() {
      board = BoardScreen.getInstance();
      board.create();
   }

}