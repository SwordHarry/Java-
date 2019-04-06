package receiver;

public class BoardScreen {

   private volatile static BoardScreen board;

   private BoardScreen() {

   }

   public static BoardScreen getInstance() {
      if (board == null) {
         synchronized (BoardScreen.class) {
            if(board == null) {
               board = new BoardScreen();
            }
         }
      }
      return board;
   }

   public void create() {
      System.out.println("创建公告板");
   }

   public void open() {
      System.out.println("打开公告板");
   }

   public void edit() {
      System.out.println("编辑公告板");
   }

}