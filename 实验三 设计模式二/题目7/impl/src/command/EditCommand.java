package command;

import receiver.BoardScreen;

public class EditCommand extends AbstractCommand {

   private BoardScreen board;

   public void execute() {
      board = BoardScreen.getInstance();
      board.edit();
   }

}